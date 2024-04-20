package org.example.Prendas;

import java.awt.*;
import java.util.Objects;

public class PrendaBuilder {
  private TipoPrenda tipo;
  private Material material;
  private String colorPrincipal;
  private String colorSecundario;
  private Trama trama;

  public PrendaBuilder conTipo (TipoPrenda tipo) {
    this.tipo = tipo;
    return this;
  }

  public PrendaBuilder conMaterial(Material material) {
    this.material = material;
    return this;
  }

  public PrendaBuilder conColorPrincipal(String colorPrincipal) {
    this.colorPrincipal = String.valueOf(existeColor(colorPrincipal));
    return this;
  }

  public PrendaBuilder conColorSecundario(String colorSecundario) {
    this.colorSecundario = String.valueOf(existeColor(colorSecundario));
    return this;
  }

  public PrendaBuilder conTrama(Trama trama) {
    this.trama = trama;
    return this;
  }

  public Prenda crearPrenda() {
    if (trama == null) {
      trama = Trama.LISA; // Si no se especifica trama, por defecto es lisa
    }
    return new Prenda(tipo, material, colorPrincipal, colorSecundario, trama);
  }

  private Color existeColor(String nombreColor) {
    if (nombreColor.matches("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$")) {
      return Color.decode(nombreColor);
    } else {
      throw new IllegalArgumentException("Color no válido: " + nombreColor);
    }
  }
}


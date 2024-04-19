package org.example.Uniformes;

import org.example.Prendas.Material;
import org.example.Prendas.Prenda;
import org.example.Prendas.TipoPrenda;
import org.example.Prendas.Trama;

public class Uniforme {
  private Prenda prendaSuperior;
  private Prenda prendaInferior;
  private Prenda calzado;

  public Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.calzado = calzado;
  }
}

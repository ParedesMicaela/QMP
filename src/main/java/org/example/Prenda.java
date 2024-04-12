package org.example;
import org.example.TipoPrenda;

import java.awt.*;

import static java.util.Objects.requireNonNull;

public class Prenda {
    private TipoPrenda tipo;
    private Material material;
    private Color colorPrincipal;
    private Color colorSecundario;

    public Prenda(TipoPrenda tipo, Material material, Color colorPrincipal, Color colorSecundario) {
        this.tipo = requireNonNull(tipo,"campo obligatorio");
        this.material = requireNonNull(material, "obligatorio");
        this.colorPrincipal = requireNonNull(colorPrincipal, "obligatorio");
        this.colorSecundario = colorSecundario;
    }

    public Categoria obtenerCategoria(){
       return tipo.getCategoria();
    }

    private Color existeColor(String nombreColor) {
        if (nombreColor.matches("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$")) {
            return Color.decode(nombreColor);
        } else {
            throw new IllegalArgumentException("Color no válido: " + nombreColor);
        }
    }
}

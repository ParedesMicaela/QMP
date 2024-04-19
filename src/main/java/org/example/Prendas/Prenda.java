package org.example.Prendas;

import static java.util.Objects.requireNonNull;

public class Prenda {
    private TipoPrenda tipo;
    private Material material;
    private String colorPrincipal;
    private String colorSecundario;
    private Trama trama;

    public Categoria obtenerCategoria(){
       return tipo.getCategoria();
    }

    public Prenda(TipoPrenda tipo, Material material, String colorPrincipal, String colorSecundario, Trama trama) {
        this.tipo = tipo;
        this.material = material;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
        this.trama = Trama.LISA; // Trama por defecto es lisa
    }
}

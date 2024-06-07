package org.example.Prendas;

public class GeneradorSugerencias {

    public Sugerencia generar(Usuario usuario, AdapterClima adapterClima) {
        adapterClima.getClima(usuario.getLocalizacion());
        Sugerencia nueva = new Sugerencia;
    }
}

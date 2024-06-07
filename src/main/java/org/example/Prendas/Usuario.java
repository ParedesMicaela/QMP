package org.example.Prendas;

public class Usuario {
    private Sugerencia sugerenciaDiaria;

    public void actualizarSugerenciaDiaria(Sugerencia sugerencia) {
        sugerenciaDiaria = sugerencia;
    }

    public void recibirNuevaSugerencia() {

    }

    public List<Alerta> verUltimasAlertas();

    public onAlertOccurence(Sugerencia sugerencia);
    
}



//necesito tener en un lugar todos los usuarios

package org.example.Prendas;

public class Usuario {
    private Sugerencia sugerenciaDiaria;

    //estado comunicacional es guardar un estado pero no retornarlo porque nadie lo usa.
    //hay empleados en el sistema pero no es un concepto, poner objetos para que hagan una accion porque si esta mal.

    public void actualizarSugerenciaDiaria(Sugerencia sugerencia) {
        sugerenciaDiaria = sugerencia;
    }

    public void recibirNuevaSugerencia() {

    }

    public List<Alerta> verUltimasAlertas();

    @On(event = "myEvent")
    void onAlertOccurence(Sugerencia sugerencia);
    
}



//necesito tener en un lugar todos los usuarios

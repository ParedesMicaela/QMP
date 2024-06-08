package org.example.Prendas;

//objeto que conoce todas las instancias de cierto tipo y puede entender mensajes

import java.util.List;

//Como empleade de QueMePongo quiero poder disparar el cálculo de sugerencias diarias
// para todos los usuarios para poder ejecutar esta acción a principio de cada día.

//conoce toda la familia de un objeto no necesariamente solo una clase.
public class RepositorioUsuario {
    private List<Usuario> usuarios;
    private AdapterClima adapterClima;
    private GeneradorSugerencias generadorSugerencias;

    public List<Usuario> todos() {
        return this.usuarios;
    }

    // modelo un evento cuando no se cuando va a pasar la accion, asincronismo, que sea automatico o manual no es el punto
    // cuando busco polimorfismo uso eventos. Si siemore que se dispara ese evento candidato siempre se hace lo mismo,
    // entonces NO ES UN EVENTO. Si siempre que pase una cosa va a pasar la otra y NO hay otras cosas que puedan pasar, no hay eventos. 
    // para que tenga sentido el evento tiene que haber distintos suscriptores y voy a poder cambiar, agregar y eliminar suscriptores.
    // pepita vola, no es un evento por ejemplo. Simpre hace lo mismo.
    // si devuelvo algo no void -> no es un evento
    // si el nombre del evento me dice exactamender que hacer -> no es evento.

    //Como usuarie de QuéMePongo quiero que se actualice mi sugerencia diaria con las condiciones
    //climáticas actualizadas cuando se genere algún alerta durante el día. No es un evento porque siempre hace lo mismo.
    
    // es el unico que conoce a todos los usuarios y el que tiene que geerar y mandar la noti
    public void generarSugerenciaDiariaParaTodos() {
        this.todos().forEach(usuario -> {Sugerencia nuevaSugerencia = generadorSugerencias.generar(usuario, adapterClima);
        usuario.actualizarSugerenciaDiaria(nuevaSugerencia);});
    }

}

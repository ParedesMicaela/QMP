package org.example.Prendas;

//objeto que conoce todas las instancias de cierto tipo y puede entender mensajes

import java.util.List;

//Como empleade de QueMePongo quiero poder disparar el cálculo de sugerencias diarias
// para todos los usuarios para poder ejecutar esta acción a principio de cada día.

public class RepositorioUsuario {
    private List<Usuario> usuarios;
    private AdapterClima adapterClima;
    private GeneradorSugerencias generadorSugerencias;

    public List<Usuario> todos() {
        return this.usuarios;
    }

    // es el unico que conoce a todos los usuarios y el que tiene que geerar y mandar la noti
    public void generarSugerenciaDiariaParaTodos() {
        this.todos().forEach(usuario -> {Sugerencia nuevaSugerencia = generadorSugerencias.generar(usuario, adapterClima);
        usuario.actualizarSugerenciaDiaria(nuevaSugerencia);});
    }

}

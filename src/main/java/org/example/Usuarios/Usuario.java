package org.example.Usuarios;

import org.example.Guardaropas.Guardaropa;
import org.example.Prendas.Prenda;

import java.util.List;

public class Usuario {
  private List<Guardaropa> guardarropas;

  public void crearGuardaropasCompartido(Usuario compartirCon, Guardaropa compartido) {
    this.agregarGuardaropa(compartido);
    compartido.agregarCompartidoCon(this);
  }

  public void agregarGuardaropa(Guardaropa nuevoGuardaropa) {
    this.guardarropas.add(nuevoGuardaropa);
  }

  public void agregarPrendaGuardaropas(Prenda prenda, Guardaropa guardaropa) {
    guardaropa.agregarPrenda(prenda);
  }
}

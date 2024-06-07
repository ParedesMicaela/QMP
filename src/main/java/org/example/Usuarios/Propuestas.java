package org.example.Usuarios;

import org.example.Guardaropas.Guardaropa;
import org.example.Prendas.Prenda;

public abstract class Propuestas {
  private EstadoPropuesta estado = EstadoPropuesta.PENDIENTE;

  public void aceptarPropuesta(Prenda prenda, Guardaropa guardaropa) {
    guardaropa.agregarPrenda(prenda);
    this.cambiarEstado(EstadoPropuesta.ACEPTADA);
  }

  public void rechazarPropuesta(Prenda prenda, Guardaropa guardaropa) {
    this.cambiarEstado(EstadoPropuesta.RECHAZADA);
  }

  public void cambiarEstado(EstadoPropuesta estado) {
    this.estado = estado;
  }
}

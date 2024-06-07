package org.example.Guardaropas;

import org.example.Prendas.Prenda;
import org.example.Usuarios.Usuario;

import java.util.List;

public class Guardaropa {
  private Usuario usuario;
  private String criterioGuardaropas; //es mio asi que yo le pongo el nombre que quiero
  private List<Usuario> compartidoCon; //puede ser null
  private List<Prenda> prendas;

  public void agregarCompartidoCon(Usuario usuario) {
    this.compartidoCon.add(usuario);
  }

  public void agregarPrenda(Prenda prenda) {
    this.prendas.add(prenda);
  }

}

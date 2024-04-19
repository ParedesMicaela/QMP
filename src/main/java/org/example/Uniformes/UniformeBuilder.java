package org.example.Uniformes;

import org.example.Prendas.Categoria;
import org.example.Prendas.Material;
import org.example.Prendas.Prenda;
import org.example.Prendas.PrendaBuilder;
import org.example.Prendas.TipoPrenda;
import org.example.Prendas.Trama;

public abstract class UniformeBuilder {
  private Prenda prendaSuperior;
  private Prenda prendaInferior;
  private Prenda calzado;

  protected abstract Prenda armarParteSuperior();

  protected abstract Prenda armarParteInferior();

  protected abstract Prenda armarCalzado();

  public Uniforme sugerirUniforme() {
    return new Uniforme(this.armarParteSuperior(), this.armarParteInferior(), this.armarCalzado());
  }
}


class SanJuan extends UniformeBuilder {

  @Override
  public Prenda armarParteSuperior(){
    PrendaBuilder prendaBuilder = new PrendaBuilder();
    TipoPrenda tipoPrenda = new TipoPrenda(Categoria.PARTE_SUPERIOR); // Suponiendo que TipoPrenda tiene un constructor que acepta una Categoria
    prendaBuilder.conTipo(tipoPrenda);
    prendaBuilder.conMaterial(Material.ALGODON);
    prendaBuilder.conColorPrincipal("blanco");
    prendaBuilder.conTrama(Trama.ESTAMPADA);
    return prendaBuilder.crearPrenda();
  }

  @Override
  protected Prenda armarParteInferior() {
    PrendaBuilder prendaBuilder = new PrendaBuilder();
    TipoPrenda tipoPrenda = new TipoPrenda(Categoria.PARTE_INFERIOR); // Suponiendo que TipoPrenda tiene un constructor que acepta una Categoria
    prendaBuilder.conTipo(tipoPrenda);
    prendaBuilder.conMaterial(Material.JEAN);
    prendaBuilder.conColorPrincipal("azul");
    prendaBuilder.conTrama(Trama.LISA);
    return prendaBuilder.crearPrenda();
  }

  @Override
  protected Prenda armarCalzado() {
    PrendaBuilder prendaBuilder = new PrendaBuilder();
    TipoPrenda tipoPrenda = new TipoPrenda(Categoria.CALZADO); // Suponiendo que TipoPrenda tiene un constructor que acepta una Categoria
    prendaBuilder.conTipo(tipoPrenda);
    prendaBuilder.conMaterial(Material.CUERO);
    prendaBuilder.conColorPrincipal("negro");
    prendaBuilder.conColorSecundario("blanco");
    prendaBuilder.conTrama(Trama.RAYADA);
    return prendaBuilder.crearPrenda();
  }
}
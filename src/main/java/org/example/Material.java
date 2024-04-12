package org.example;
import java.lang.Exception;

public enum Material {
    ALGODON,
    JEAN,
    CUERO,
    SEDA;
    //otros materiales mas

    public static Material getMaterialPorNombre(String nombre) {
        for (Material material : Material.values()) {
            if (material.name().equalsIgnoreCase(nombre)) {
                return material;
            }
        }
        throw new IllegalArgumentException("Material no válido: " + nombre);
    }
}

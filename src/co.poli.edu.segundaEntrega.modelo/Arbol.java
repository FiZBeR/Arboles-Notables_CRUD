package co.poli.edu.segundaEntrega.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Arbol extends Especie {

    /**
     * 
     */
    private double altura;

    /**
     * 
     */
    private double diametro_tronco;

    /**
     * 
     */
    private int edad_estimada;

    public Arbol(String nombre_cientifico, String nombre_comun, String origen, double altura, double diametro_tronco, int edad_estimada) {
        super(nombre_cientifico, nombre_comun, origen);
        this.altura = altura;
        this.diametro_tronco = diametro_tronco;
        this.edad_estimada = edad_estimada;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getDiametro_tronco() {
        return diametro_tronco;
    }

    public void setDiametro_tronco(double diametro_tronco) {
        this.diametro_tronco = diametro_tronco;
    }

    public int getEdad_estimada() {
        return edad_estimada;
    }

    public void setEdad_estimada(int edad_estimada) {
        this.edad_estimada = edad_estimada;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "altura=" + altura +
                ", diametro_tronco=" + diametro_tronco +
                ", edad_estimada=" + edad_estimada +
                '}';
    }
}

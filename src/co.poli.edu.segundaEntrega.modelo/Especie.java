package co.poli.edu.segundaEntrega.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class Especie {


    /**
     * 
     */
    private String nombre_cientifico;

    /**
     * 
     */
    private String nombre_comun;

    /**
     * 
     */
    private String origen;

    public Especie(String nombre_cientifico, String nombre_comun, String origen) {
        this.nombre_cientifico = nombre_cientifico;
        this.nombre_comun = nombre_comun;
        this.origen = origen;
    }

    public String getNombre_cientifico() {
        return nombre_cientifico;
    }

    public void setNombre_cientifico(String nombre_cientifico) {
        this.nombre_cientifico = nombre_cientifico;
    }

    public String getNombre_comun() {
        return nombre_comun;
    }

    public void setNombre_comun(String nombre_comun) {
        this.nombre_comun = nombre_comun;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "Especie{" +
                "nombre_cientifico='" + nombre_cientifico + '\'' +
                ", nombre_comun='" + nombre_comun + '\'' +
                ", origen='" + origen + '\'' +
                '}';
    }
}
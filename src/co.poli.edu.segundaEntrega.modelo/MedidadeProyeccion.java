package co.poli.edu.segundaEntrega.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class MedidadeProyeccion {

    /**
     * 
     */
    private String tipo_proteccion;

    /**
     * 
     */
    private String fecha_inicio;

    /**
     * 
     */
    private Institucion autoridad;


    public MedidadeProyeccion(String tipo_proteccion, String fecha_inicio, Institucion autoridad) {
        this.tipo_proteccion = tipo_proteccion;
        this.fecha_inicio = fecha_inicio;
        this.autoridad = autoridad;
    }


    public String getTipo_proteccion() {
        return tipo_proteccion;
    }

    public void setTipo_proteccion(String tipo_proteccion) {
        this.tipo_proteccion = tipo_proteccion;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Institucion getAutoridad() {
        return autoridad;
    }

    public void setAutoridad(Institucion autoridad) {
        this.autoridad = autoridad;
    }

    @Override
    public String toString() {
        return "MedidadeProyeccion{" +
                "tipo_proteccion='" + tipo_proteccion + '\'' +
                ", fecha_inicio='" + fecha_inicio + '\'' +
                ", autoridad=" + autoridad +
                '}';
    }
}
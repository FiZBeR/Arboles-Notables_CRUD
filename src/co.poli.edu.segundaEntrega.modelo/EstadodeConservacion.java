package co.poli.edu.segundaEntrega.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class EstadodeConservacion {

    /**
     * 
     */
    private String estado_salud;

    /**
     * 
     */
    private String fecha_revision;

    /**
     * 
     */
    private MedidadeProyeccion medida_proteccion;

    /**
     * 
     */
    private String comentarios;


    public EstadodeConservacion(String estado_salud, String fecha_revision, MedidadeProyeccion medida_proteccion, String comentarios) {
        this.estado_salud = estado_salud;
        this.fecha_revision = fecha_revision;
        this.medida_proteccion = medida_proteccion;
        this.comentarios = comentarios;
    }

    public String getEstado_salud() {
        return estado_salud;
    }

    public void setEstado_salud(String estado_salud) {
        this.estado_salud = estado_salud;
    }

    public String getFecha_revision() {
        return fecha_revision;
    }

    public void setFecha_revision(String fecha_revision) {
        this.fecha_revision = fecha_revision;
    }

    public MedidadeProyeccion getMedida_proteccion() {
        return medida_proteccion;
    }

    public void setMedida_proteccion(MedidadeProyeccion medida_proteccion) {
        this.medida_proteccion = medida_proteccion;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "EstadodeConservacion{" +
                "estado_salud='" + estado_salud + '\'' +
                ", fecha_revision='" + fecha_revision + '\'' +
                ", medida_proteccion=" + medida_proteccion +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
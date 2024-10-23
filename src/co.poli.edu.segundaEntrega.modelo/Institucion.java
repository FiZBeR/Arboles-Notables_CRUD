package co.poli.edu.segundaEntrega.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Institucion {

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String contacto;

    /**
     * 
     */
    private String tipo_entidad;


    public Institucion(String nombre, String contacto, String tipo_entidad) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.tipo_entidad = tipo_entidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTipo_entidad() {
        return tipo_entidad;
    }

    public void setTipo_entidad(String tipo_entidad) {
        this.tipo_entidad = tipo_entidad;
    }

    @Override
    public String toString() {
        return "Institucion{" +
                "nombre='" + nombre + '\'' +
                ", contacto='" + contacto + '\'' +
                ", tipo_entidad='" + tipo_entidad + '\'' +
                '}';
    }

    /**
     * @return
     */
    public String contactar() {
        // TODO implement here
        return "";
    }

}
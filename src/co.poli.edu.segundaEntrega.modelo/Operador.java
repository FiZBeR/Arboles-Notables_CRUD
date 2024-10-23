package co.poli.edu.segundaEntrega.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Operador {

    /**
     * 
     */
    private String id_operador;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String tipo_sanguineo ;

    /**
     * 
     */
    private String contacto_celular;

    /**
     * 
     */
    private String correo;


    public Operador(String id_operador, String nombre, String tipo_sanguineo, String contacto_celular, String correo) {
        this.id_operador = id_operador;
        this.nombre = nombre;
        this.tipo_sanguineo = tipo_sanguineo;
        this.contacto_celular = contacto_celular;
        this.correo = correo;
    }


    public String getId_operador() {
        return id_operador;
    }

    public void setId_operador(String id_operador) {
        this.id_operador = id_operador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_sanguineo() {
        return tipo_sanguineo;
    }

    public void setTipo_sanguineo(String tipo_sanguineo) {
        this.tipo_sanguineo = tipo_sanguineo;
    }

    public String getContacto_celular() {
        return contacto_celular;
    }

    public void setContacto_celular(String contacto_celular) {
        this.contacto_celular = contacto_celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Operador{" +
                "id_operador='" + id_operador + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipo_sanguineo='" + tipo_sanguineo + '\'' +
                ", contacto_celular='" + contacto_celular + '\'' +
                ", correo='" + correo + '\'' +
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
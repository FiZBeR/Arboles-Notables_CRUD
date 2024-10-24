package co.poli.edu.segundaEntrega.servicios;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Ubicacion {
    /**
     * 
     */
    private Coordenadas coordenadas;

    /**
     * 
     */
    private String ciudad;

    /**
     * 
     */
    private String localidad;

    /**
     * 
     */
    private String barrio;

    /**
     * 
     */
    private String direccion;

    public Ubicacion(Coordenadas coordenadas, String ciudad, String localidad, String barrio, String direccion) {
        this.coordenadas = coordenadas;
        this.ciudad = ciudad;
        this.localidad = localidad;
        this.barrio = barrio;
        this.direccion = direccion;
    }

    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Ubicacion{" +
                "coordenadas=" + coordenadas +
                ", ciudad='" + ciudad + '\'' +
                ", localidad='" + localidad + '\'' +
                ", barrio='" + barrio + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
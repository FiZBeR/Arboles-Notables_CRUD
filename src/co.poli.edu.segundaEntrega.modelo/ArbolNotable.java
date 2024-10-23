package co.poli.edu.segundaEntrega.modelo;

import co.poli.edu.segundaEntrega.servicios.Ubicacion;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class ArbolNotable extends Arbol {

    /**
     * 
     */
    private String id;

    /**
     * 
     */
    public Ubicacion ubicacion;

    /**
     * 
     */
    private Registro registro;

    /**
     * 
     */
    private EstadodeConservacion [ ] estado;


    public ArbolNotable(String nombre_cientifico, String nombre_comun, String origen, double altura, double diametro_tronco, int edad_estimada, String id, Ubicacion ubicacion, Registro registro, EstadodeConservacion[] estado) {
        super(nombre_cientifico, nombre_comun, origen, altura, diametro_tronco, edad_estimada);
        this.id = id;
        this.ubicacion = ubicacion;
        this.registro = registro;
        this.estado = estado;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    public EstadodeConservacion[] getEstado() {
        return estado;
    }

    public void setEstado(EstadodeConservacion[] estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ArbolNotable{" +
                "id='" + id + '\'' +
                ", ubicacion=" + ubicacion +
                ", registro=" + registro +
                ", estado=" + Arrays.toString(estado) +
                '}';
    }

    /**
     * @param fecha 
     * @param Parameter1
     */
    public void tiempo_de_conservacion(String fecha, int Parameter1) {
        // TODO implement here
    }

}
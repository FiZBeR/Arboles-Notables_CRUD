package co.poli.edu.segundaEntrega.servicios;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Coordenadas {

    /**
     * 
     */
    private float latitud;

    /**
     * 
     */
    private float longitud;

    public Coordenadas(float latitud, float longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }


}
package co.poli.edu.segundaEntrega.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Registro {


    /**
     * 
     */
    private Operador operador;

    /**
     * 
     */
    private String fecha_registro;


    public Registro(Operador operador, String fecha_registro) {
        this.operador = operador;
        this.fecha_registro = fecha_registro;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "operador=" + operador +
                ", fecha_registro='" + fecha_registro + '\'' +
                '}';
    }

    /**
     * @param mensaje 
     * @param id_operador
     */
    public void enviar_mensaje(String mensaje, String id_operador) {
        // TODO implement here
    }

}
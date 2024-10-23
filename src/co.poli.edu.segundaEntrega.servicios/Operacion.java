package co.poli.edu.segundaEntrega.servicios;

import co.poli.edu.segundaEntrega.modelo.ArbolNotable;

import java.io.*;
import java.util.*;

/**
 * 
 */
public interface Operacion {

    /**
     * 
     */
    public void Attribute1;

    /**
     * @param x 
     * @return
     */
    public String create(ArbolNotable x);

    /**
     * @param id 
     * @return
     */
    public ArbolNotable read(String id);

    /**
     * @return
     */
    public ArbolNotable [ ] readall();

    /**
     * @param id 
     * @param x 
     * @return
     */
    public String update(String id, ArbolNotable x);

    /**
     * @param id 
     * @return
     */
    public ArbolNotable delete(String id);

    /**
     * @param arbolnotable 
     * @param Parameter2 
     * @param Parameter3 
     * @return
     */
    public void serializar(ArbolNotable [ ] arbolnotable, void Parameter2, void Parameter3);

    /**
     * 
     */
    public void deserializar();

}
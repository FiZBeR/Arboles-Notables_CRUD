package co.poli.edu.segundaEntrega.servicios;

import co.poli.edu.segundaEntrega.modelo.ArbolNotable;

import java.io.*;
import java.util.*;

/**
 * 
 */
public interface Operacion {

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
    public String serializar(ArbolNotable [ ] arbolnotable, String Parameter2, String Parameter3);

    /**
     * @param path
     * @param name
     * @return
     */
    public ArbolNotable [ ] deserializar(String path, String name);

}
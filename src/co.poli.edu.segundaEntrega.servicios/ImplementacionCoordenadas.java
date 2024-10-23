package co.poli.edu.segundaEntrega.servicios;

import co.poli.edu.segundaEntrega.modelo.ArbolNotable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ImplementacionCoordenadas implements Operacion {
    private ArbolNotable[] arbolNotable;
    public void OperacionImplementacion() {
        arbolNotable = new ArbolNotable[1];
    }

    public void setEArbolNotable(ArbolNotable[] arbolNotable) {
        this.arbolNotable = arbolNotable;
    }

    /**
     * @param x
     * @return
     */
    public String create(ArbolNotable x) {
        // TODO implement co.poli.edu.segundaEntrega.servicios.Operacion.create() here
        for (int i = 0; i < arbolNotable.length; i++) {
            if (arbolNotable[i] == null) {
                arbolNotable[i] = x;
                return "Save!";
            }
        }
        ArbolNotable[] ArbolNotableaux = new ArbolNotable[arbolNotable.length * 2];
        System.arraycopy(arbolNotable, 0, ArbolNotableaux, 0, arbolNotable.length);
        ArbolNotableaux[arbolNotable.length] = x;
        arbolNotable = ArbolNotableaux;
        return "Save!!";

    }

    /**
     * @param id
     * @return
     */
    public ArbolNotable read(String id) {
        // TODO implement co.poli.edu.segundaEntrega.servicios.Operacion.read() here
        for (int i = 0; i < arbolNotable.length; i++) {
            if (!(arbolNotable[i] == null))
                if (arbolNotable[i].getId().equals(id))
                    return arbolNotable[i];
        }
        return null;
    }

    /**
     * @return
     */
    public ArbolNotable [] readall() {
        // TODO implement co.poli.edu.segundaEntrega.servicios.Operacion.readall() here

        return arbolNotable;
    }

    /**
     * @param id
     * @param x
     * @return
     */
    public String update(String id, ArbolNotable x) {
        // TODO implement co.poli.edu.segundaEntrega.servicios.Operacion.update() here
        for (int i = 0; i < arbolNotable.length; i++) {
            if (!(arbolNotable[i] == null))
                if (arbolNotable[i].getId().equals(id)) {
                    arbolNotable[i] = x;
                    return "Update!";
                }
        }
        return "Cod is not in the array!";
    }

    /**
     * @param id
     * @return
     */
    public ArbolNotable delete(String id) {
        // TODO implement co.poli.edu.segundaEntrega.servicios.Operacion.delete() here
        ArbolNotable temp = null;
        for (int i = 0; i < arbolNotable.length; i++) {
            if (!(arbolNotable[i] == null))
                if (arbolNotable[i].getId().equals(id)) {
                    temp = arbolNotable[i];
                    arbolNotable[i] = null;
                    return temp;
                }
        }
        return temp;
    }

    /**
     * @param arbolnotable
     * @param path
     * @param name
     * @return
     */
    public String serializar(ArbolNotable [] arbolnotable, String path, String name) {
        // TODO implement co.poli.edu.segundaEntrega.servicios.Operacion.serializar() here
        try {
            FileOutputStream fos = new FileOutputStream(path + name);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(arbolnotable);
            oos.close();
            fos.close();
            return "File create!!";
        } catch (IOException ioe) {
            return "Error file " + ioe.getMessage();
        }
    }


    public ArbolNotable[] deserializar(String path, String name) {
        // TODO implement co.poli.edu.segundaEntrega.servicios.Operacion.deserializar() here
        ArbolNotable[] a = null;
        try {
            FileInputStream fis = new FileInputStream(path + name);
            ObjectInputStream ois = new ObjectInputStream(fis);

            a = (ArbolNotable[]) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        return a;
    }

    /**
     * @return
     */

}

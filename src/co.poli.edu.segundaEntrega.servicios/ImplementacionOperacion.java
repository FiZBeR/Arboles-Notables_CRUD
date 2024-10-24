package co.poli.edu.segundaEntrega.servicios;

import co.poli.edu.segundaEntrega.modelo.ArbolNotable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class ImplementacionOperacion implements Operacion {

    private ArbolNotable[] ArbolNotable;

    public ImplementacionOperacion() {
        ArbolNotable = new ArbolNotable[1];
    }

    public void setEArbolNotable(ArbolNotable[] ArbolNotable) {
        this.ArbolNotable = ArbolNotable;
    }

    /**
     * @param x
     * @return
     */
    public String create(ArbolNotable x) {
        // TODO implement co.poli.edu.segundaEntrega.servicios.Operacion.create() here
        for (int i = 0; i < ArbolNotable.length; i++) {
            if (ArbolNotable[i] == null) {
                ArbolNotable[i] = x;
                return "Save!";
            }
        }
        ArbolNotable[] ArbolNotableaux = new ArbolNotable[ArbolNotable.length * 2];
        System.arraycopy(ArbolNotable, 0, ArbolNotableaux, 0, ArbolNotable.length);
        ArbolNotableaux[ArbolNotable.length] = x;
        ArbolNotable = ArbolNotableaux;
        return "Save!!";

    }

    /**
     * @param id
     * @return
     */
    public ArbolNotable read(String id) {
        // TODO implement co.poli.edu.segundaEntrega.servicios.Operacion.read() here
        for (int i = 0; i < ArbolNotable.length; i++) {
            if (!(ArbolNotable[i] == null))
                if (ArbolNotable[i].getId().equals(id))
                    return ArbolNotable[i];
        }
        return null;
    }

    /**
     * @return
     */
    public ArbolNotable [] readall() {
        // TODO implement co.poli.edu.segundaEntrega.servicios.Operacion.readall() here

        return ArbolNotable;
    }

    /**
     * @param id
     * @param x
     * @return
     */
    public String update(String id, ArbolNotable x) {
        // TODO implement co.poli.edu.segundaEntrega.servicios.Operacion.update() here
        for (int i = 0; i < ArbolNotable.length; i++) {
            if (!(ArbolNotable[i] == null))
                if (ArbolNotable[i].getId().equals(id)) {
                    ArbolNotable[i] = x;
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
        for (int i = 0; i < ArbolNotable.length; i++) {
            if (!(ArbolNotable[i] == null))
                if (ArbolNotable[i].getId().equals(id)) {
                    temp = ArbolNotable[i];
                    ArbolNotable[i] = null;
                    return temp;
                }
        }
        return temp;
    }

    /**
     * @param ArbolNotable
     * @param path
     * @param name
     * @return
     */
    public String serializar(ArbolNotable [] ArbolNotable, String path, String name) {
        // TODO implement co.poli.edu.segundaEntrega.servicios.Operacion.serializar() here
        try {
            FileOutputStream fos = new FileOutputStream(path + name);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ArbolNotable);
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

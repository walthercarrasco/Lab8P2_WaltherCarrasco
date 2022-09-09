
package Main;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Universo implements Serializable{
    
    
    String nombre;
    ArrayList<Seres> seres = new ArrayList<>();

    public Universo() {
    }

    public Universo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Seres> getSeres() {
        return seres;
    }

    public void setSeres(ArrayList<Seres> seres) {
        this.seres = seres;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}

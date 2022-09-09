
package Main;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Seres implements Serializable{
    
    private int id;
    private String nombre;
    private int poder;
    private String universo;
    private String raza;

    public Seres() {
    }

    public Seres(int id, String nombre, int poder, String universo, String raza) {
        this.id = id;
        this.nombre = nombre;
        this.poder = poder;
        this.universo = universo;
        this.raza = raza;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return nombre + "\\ID:"+id;
    }
    
}

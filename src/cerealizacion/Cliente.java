/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerealizacion;

import java.io.Serializable;

/**
 *
 * @author T-301
 */
public class Cliente  implements Serializable {
    String nombre;
    float sueldo;
    Direccion dirreccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public Direccion getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(Direccion dirreccion) {
        this.dirreccion = dirreccion;
    }

    public Cliente(String nombre, float sueldo, Direccion dirreccion) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.dirreccion = dirreccion;
    }
    
}

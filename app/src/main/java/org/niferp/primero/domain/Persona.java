package org.niferp.primero.domain;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}

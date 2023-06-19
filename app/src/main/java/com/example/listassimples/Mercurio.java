package com.example.listassimples;

public class Mercurio {
    public int id;
    public int Mercurio;
    public String nombre;
    public String Des;

    public Mercurio(int id, int mercurio, String nombre, String des) {
        this.id = id;
        Mercurio = mercurio;
        this.nombre = nombre;
        Des = des;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMercurio() {
        return Mercurio;
    }

    public void setMercurio(int mercurio) {
        Mercurio = mercurio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDes() {
        return Des;
    }

    public void setDes(String des) {
        Des = des;
    }
}

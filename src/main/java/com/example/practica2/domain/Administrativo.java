package com.example.practica2.domain;

public class Administrativo implements Teacher {
    String nombre = "";
    int tipo = 1;
    int salarioBaseMensual =2000;
    int comision = 500;
    int bonus = 100;

    public Administrativo(int tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public  int getSueldo() {
        return salarioBaseMensual + bonus;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTipo(){
        return this.tipo;
    }
}

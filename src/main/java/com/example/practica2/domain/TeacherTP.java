package com.example.practica2.domain;

public class TeacherTP implements Teacher {
    String nombre = "";
    int tipo = 1;
    int salarioBaseMensual = 2000;
    int comision = 500;
    int bonus = 100;

    public TeacherTP(int tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public  int getSueldo() {
        return salarioBaseMensual;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTipo(){
        return this.tipo;
    }
}

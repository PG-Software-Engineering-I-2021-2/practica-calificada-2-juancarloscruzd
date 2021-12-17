package com.example.practica2.domain;

public class TeacherTC implements Teacher {
    String nombre = "";
    int tipo = 1;
    int salarioBaseMensual =2000;
    int comision = 500;
    int bonus = 100;

    public TeacherTC(int tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public  int getSueldo() {
        return salarioBaseMensual + comision;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTipo(){
        return this.tipo;
    }
}

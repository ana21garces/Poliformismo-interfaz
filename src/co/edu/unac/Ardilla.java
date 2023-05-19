package co.edu.unac;

import co.edu.unac.poo1.Movimiento;


public class Ardilla implements Movimiento, BajarEscalera {
    private String nombreA;
    private String color;
    private Integer tamano;

    public Ardilla() {
    }

    public Ardilla(String nombreA, String color, Integer tamano) {
        this.nombreA = nombreA;
        this.color = color;
        this.tamano = tamano;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getTamano() {
        return tamano;
    }

    public void setTamano(Integer tamano) {
        this.tamano = tamano;
    }

    @Override
    public boolean bajar() {
        return false;
    }

    @Override
    public Boolean correr() {
        return null;
    }


    @Override
    public void verInformacion() {
        System.out.println("----------------------------------------------");
        System.out.println("La ardilla llamada " + this.nombreA + ".");
        System.out.println("Es de marca " + this.color + ".");
        System.out.println("----------------------------------------------");
    }
}


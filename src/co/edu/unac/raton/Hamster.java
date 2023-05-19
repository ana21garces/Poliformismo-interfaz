package co.edu.unac.raton;

import co.edu.unac.BajarEscalera;
import co.edu.unac.poo1.Movimiento;

public class Hamster implements Movimiento {
    private String color;
    private Integer edadHamster;

    public Hamster() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getEdadHamster() {
        return edadHamster;
    }

    public void setEdadHamster(Integer edadHamster) {
        this.edadHamster = edadHamster;
    }

    @Override
    public Boolean correr() {
        return null;
    }

    @Override
    public void verInformacion() {

    }

}

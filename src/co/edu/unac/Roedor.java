package co.edu.unac;

public class Roedor {
    private String nombreDelroedor;
    private Float peso;
    private Integer edad;

    public Roedor() {
    }

    public Roedor(String nombreDelroedor, Float peso, Integer edad) {
        this.nombreDelroedor = nombreDelroedor;
        this.peso = peso;
        this.edad = edad;
    }

    public String getNombreDelroedor() {
        return nombreDelroedor;
    }

    public void setNombreDelroedor(String nombreDelroedor) {
        this.nombreDelroedor = nombreDelroedor;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}

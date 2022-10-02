package Vehiculo;

public abstract class Vehiculo {

    //Parámetros
    protected String nombre, tipo, color;
    protected double velocidad;
    protected int capacidadPersonas;

    //Constructores
    public Vehiculo() {
        this.nombre = "";
        this.tipo = "";
        this.color = "";
        this.velocidad = 0.0;
        this.capacidadPersonas = 0;
    }

    public Vehiculo(String nombre, String tipo, String color, double velocidad, int capacidadPersonas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.color = color;
        this.velocidad = velocidad;
        this.capacidadPersonas = capacidadPersonas;
    }

    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }

}

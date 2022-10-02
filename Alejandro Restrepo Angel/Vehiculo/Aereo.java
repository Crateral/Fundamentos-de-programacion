package Vehiculo;

public class Aereo extends Vehiculo implements Funcion{

    private String fabricante;

    public Aereo() {
        this.fabricante = "";
    }

    public Aereo(String nombre, String tipo, String color, double velocidad, int capacidadPersonas, String fabricante) {
        super(nombre, tipo, color, velocidad, capacidadPersonas);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public void encender() {
        System.out.println("Vehículo encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Vehículo apagado");
    }

    @Override
    public void avanzar(double distancia) {
        System.out.println("Vehículo avanzo: " + distancia + " Kms");
    }

    @Override
    public void detenerse() {
        System.out.println("Vehículo detenido");
    }

    @Override
    public String toString() {
        return "Aereo{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                ", capacidadPersonas=" + capacidadPersonas + '\'' +
                ", fabricante='" + fabricante +
                '}';
    }
}

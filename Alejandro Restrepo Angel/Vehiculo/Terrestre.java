package Vehiculo;

public class Terrestre extends Vehiculo implements Funcion{

    private String marca, tipoCombustible;

    public Terrestre() {
        this.marca = "";
        this.tipoCombustible = "";
    }

    public Terrestre(String nombre, String tipo, String color, double velocidad, int capacidadPersonas, String marca, String tipoCombustible) {
        super(nombre, tipo, color, velocidad, capacidadPersonas);
        this.marca = marca;
        this.tipoCombustible = tipoCombustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
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
        return "Terrestre{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                ", capacidadPersonas=" + capacidadPersonas + '\'' +
                ", marca='" + marca + '\'' +
                ", tipoCombustible='" + tipoCombustible +
                '}';
    }
}

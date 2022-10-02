package Vehiculo;

public class Acuatico extends Vehiculo implements Funcion{

    private String tipoPropulsion;
    private double eslora;

    public Acuatico() {
        this.eslora = 0.0;
        this.tipoPropulsion = "";
    }

    public Acuatico(String nombre, String tipo, String color, double velocidad, int capacidadPersonas, double eslora, String tipoPropulsion) {
        super(nombre, tipo, color, velocidad, capacidadPersonas);
        this.eslora = eslora;
        this.tipoPropulsion = tipoPropulsion;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public String getTipoPropulsion() {
        return tipoPropulsion;
    }

    public void setTipoPropulsion(String tipoPropulsion) {
        this.tipoPropulsion = tipoPropulsion;
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
        System.out.println("Vehículo avanzo: " + distancia + " millas náuticas");
    }

    @Override
    public void detenerse() {
        System.out.println("Vehículo detenido");
    }

    @Override
    public String toString() {
        return "Acuatico{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                ", capacidadPersonas=" + capacidadPersonas + '\'' +
                ", eslora='" + eslora + '\'' +
                ", tipoPropulsion='" + tipoPropulsion +
                '}';
    }
}

package EmpresaTransporte;

public class Envio extends Cliente implements Vehiculo{

    protected String fecha, contenido;
    protected double peso, costo;
    protected Cliente remintente, destinatario;

    public Envio() {
        this.fecha = "";
        this.contenido = "";
        this.peso = 0.0;
        this.costo = 0.0;
        this.remintente = null;
        this.destinatario = null;
    }

    public Envio( String fecha, String contenido, double peso, double costo, Cliente remintente, Cliente destinatario) {
        this.fecha = fecha;
        this.contenido = contenido;
        this.peso = peso;
        this.costo = costo;
        this.remintente = remintente;
        this.destinatario = destinatario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public void asignarVehiculo(String placas) {
        System.out.println("El vehículo de placas: " + placas + " ya está en camino con tu envío");
    }

    @Override
    public String toString() {
        return "Envio{" +
                "fecha='" + fecha + '\'' +
                ", contenido='" + contenido + '\'' +
                ", peso=" + peso + '\'' +
                ", costo=" + costo + '\'' +
                ", remintente=" + remintente + '\'' +
                ", destinatario=" + destinatario + '\'' +
                '}';
    }
}

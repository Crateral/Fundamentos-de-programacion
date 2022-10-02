package FiguraGeometrica;

public class Cuadrado extends Figura{

    //Parámetros
    private Double lado;

    //Constructores
    public Cuadrado() {
        this.lado = 0.0;
        obtenerArea();
        obtenerPerimetro();
    }

    public Cuadrado(Double lado) {
        this.lado = lado;
        obtenerArea();
        obtenerPerimetro();
    }

    //Getter y Setter
    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    //Métodos que se sobreescriben
    @Override
    void obtenerArea() {
        area = lado*lado;
    }

    @Override
    void obtenerPerimetro() {
        perimetro = 4 * lado;
    }

    //Método para retornar un mensaje
    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                ", area=" + area +
                ", perimetro=" + perimetro +
                '}';
    }
}

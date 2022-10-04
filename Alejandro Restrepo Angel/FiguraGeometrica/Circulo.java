package FiguraGeometrica;

public class Circulo extends Figura{

    //Parámetros
    private Double radio;

    //Constructores
    public Circulo() {
        this.radio = 0.0;
        obtenerArea();
        obtenerPerimetro();
    }

    public Circulo(Double radio) {
        this.radio = radio;
        obtenerArea();
        obtenerPerimetro();
    }

    //Getter y Setter
    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    //Métodos que se sobreescriben
    @Override
    void obtenerArea() {
        area = Math.PI * (radio*radio);
    }

    @Override
    void obtenerPerimetro() {
        perimetro = 2 * Math.PI * radio;
    }

    //Método para retornar un mensaje
    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", area=" + area +
                ", perimetro=" + perimetro +
                '}';
    }
}

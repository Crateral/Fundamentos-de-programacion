package FiguraGeometrica;

public class Trapecio extends Figura{

    //Parámetros
    private Double baseMenor, baseMayor, lado, altura;

    //Constructores
    public Trapecio() {
        this.baseMenor = 0.0;
        this.baseMayor = 0.0;
        this.lado = 0.0;
        this.altura = 0.0;
        obtenerArea();
        obtenerPerimetro();
    }

    public Trapecio(Double baseMenor, Double baseMayor, Double lado, Double altura) {
        this.baseMenor = baseMenor;
        this.baseMayor = baseMayor;
        this.lado = lado;
        this.altura = altura;
        obtenerArea();
        obtenerPerimetro();
    }

    //Getter y Setter
    public Double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(Double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public Double getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(Double baseMayor) {
        this.baseMayor = baseMayor;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    //Métodos que se sobreescriben
    @Override
    void obtenerArea() {
        area = ((baseMenor+baseMayor)/2)*altura;
    }

    @Override
    void obtenerPerimetro() {
        perimetro = baseMayor+baseMenor+lado+lado;
    }

    @Override
    public String toString() {
        return "Trapecio{" +
                "baseMenor=" + baseMenor +
                ", baseMayor=" + baseMayor +
                ", lado=" + lado +
                ", altura=" + altura +
                ", area=" + area +
                ", perimetro=" + perimetro +
                '}';
    }
}

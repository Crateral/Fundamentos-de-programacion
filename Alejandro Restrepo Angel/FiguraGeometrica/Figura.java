package FiguraGeometrica;

public abstract class Figura
{
    //Parámetros a calcular de las figuras
    protected Double area, perimetro;

    //Constructores
    public Figura() {
        this.area=0.0;
        this.perimetro=0.0;
    }

    public Figura(Double area, Double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    //Getter y Setter
    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    //Métodos para obtener el área y el perímetro en las clases hijas
    abstract void obtenerArea();
    abstract void obtenerPerimetro();

}

package QuizSemana1;

public class Mata extends Planta implements cicloVida {

    public Mata(double altura, String nombre, boolean fruto, boolean flores) {
        super(altura, nombre, fruto, flores);
    }

    @Override
    public void nacer() {
        System.out.println("La mata germinó");
    }

    @Override
    public void morir() {
        System.out.println("La mata fue arrancada");
    }

    @Override
    public String toString() {
        return "Mata{" +
                "nombre='" + nombre +
                ", altura=" + altura +
                ", vida=Varias temporadas" +
                ", tallo=leñosos" +
                '}';
    }
}

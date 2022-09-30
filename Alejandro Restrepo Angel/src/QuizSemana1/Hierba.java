package QuizSemana1;

public class Hierba extends Planta implements cicloVida {

    public Hierba(double altura, String nombre, boolean fruto, boolean flores) {
        super(altura, nombre, fruto, flores);
    }

    @Override
    public void nacer() {
        System.out.println("La hierba germinó");
    }

    @Override
    public void morir() {
        System.out.println("La hierba se secó");
    }

    @Override
    public String toString() {
        return "Hierba{" +
                "nombre='" + nombre +
                ", altura=" + altura +
                ", vida=Corta" +
                ", tallo=Blandos y verdes" +
                '}';
    }
}

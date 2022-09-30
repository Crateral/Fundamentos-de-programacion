package QuizSemana1;

public class Arbusto extends Planta implements cicloVida {

    public Arbusto(double altura, String nombre, boolean fruto, boolean flores) {
        super(altura, nombre, fruto, flores);
    }

    @Override
    public void nacer() {
        System.out.println("El arbusto germinó");
    }

    @Override
    public void morir() {
        System.out.println("El arbusto fue cortado");
    }

    @Override
    public String toString() {
        return "Arbusto{" +
                "nombre='" + nombre +
                ", altura=" + altura +
                ", vida=Larga" +
                ", tallo=Corto y leñoso duro" +
                '}';
    }
}

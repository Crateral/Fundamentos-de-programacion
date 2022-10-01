package QuizSemana1;

public class Arbol extends Planta implements cicloVida {

    public Arbol(double altura, String nombre, boolean fruto, boolean flores) {
        super(altura, nombre, fruto, flores);
    }

    @Override
    public void nacer() {
        System.out.println("El árbol germinó de las semillas");
    }

    @Override
    public void morir() {
        System.out.println("El árbol fue cortado");
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "nombre='" + nombre  +
                ", altura=" + altura +
                ", vida=Longevos/Siglos" +
                ", tallo= tronco fuerte y leñoso" +
                '}';
    }
}

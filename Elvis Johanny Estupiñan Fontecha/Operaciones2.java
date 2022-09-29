package Ejercicio1;

public class Operaciones2 {

    public static void main(String[] args) {

        Operaciones operaciones = new Operaciones();
        System.out.println("la suma es: "+ operaciones.suma(3, 2));
        System.out.println("la resta es: "+ operaciones.resta(3, 2));
        System.out.println("la multiplicacion es: "+ operaciones.multiplicacion(3, 2));
        operaciones.division(3, 3);
    }
}

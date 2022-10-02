package FiguraGeometrica;

//Taller herencia:
//1. Realizar la implmentacion y separacion de figuras geometricas

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion;
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("\nFiguras");
            System.out.println("=========================");
            System.out.println("1.Círculo");
            System.out.println("2.Cuadrado");
            System.out.println("3.Trapecio");
            System.out.println("4.Salir.");
            System.out.print("Ingrese la opción:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nCírculo");
                    System.out.print("Ingrese radio: ");
                    double radio = scanner.nextDouble();
                    Circulo circulo = new Circulo (radio);
                    System.out.println(circulo.toString());
                    break;
                case 2:
                    System.out.println("\nCuadrado");
                    System.out.print("Ingrese lado: ");
                    double lado = scanner.nextDouble();
                    Cuadrado cuadrado = new Cuadrado (lado);
                    System.out.println(cuadrado.toString());
                    break;
                case 3:
                    System.out.println("\nTrapecio");
                    System.out.print("Ingrese Base menor: ");
                    double baseMenor = scanner.nextDouble();
                    System.out.print("Ingrese Base Mayor: ");
                    double baseMayor = scanner.nextDouble();
                    System.out.print("Ingrese lado: ");
                    lado = scanner.nextDouble();
                    System.out.print("Ingrese altura: ");
                    double altura = scanner.nextDouble();
                    Trapecio trapecio = new Trapecio (baseMenor,baseMayor,lado,altura);
                    System.out.println(trapecio.toString());
                    break;
                case 4:
                    System.out.println("Programa Finalizado\n");
                    break;
                default:
                    System.out.println("Error: " + opcion + " no es una opción válida.\n");
            }
        }
        while (opcion != 4);
        scanner.close();

    }
}

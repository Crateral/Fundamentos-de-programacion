package Calculadora;

import java.util.Scanner;

public class Calculadora
{
    public static void main(String[] args) {

        int opcion;
        float numero1, numero2;
        Scanner scanner = new Scanner(System.in);

        do {

            Operacion funcion = new Operacion();

            System.out.println("\nOperaciones");
            System.out.println("=========================");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir.");
            System.out.print("Ingrese la opción:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nSuma");
                    System.out.print("Ingrese número1: ");
                    numero1 = scanner.nextFloat();
                    System.out.print("Ingrese número2: ");
                    numero2 = scanner.nextFloat();
                    System.out.println("Resultado: " + funcion.sumar(numero1, numero2));
                    break;
                case 2:
                    System.out.println("\nResta");
                    System.out.print("Ingrese número1: ");
                    numero1 = scanner.nextFloat();
                    System.out.print("Ingrese número2: ");
                    numero2 = scanner.nextFloat();
                    System.out.println("Resultado: " + funcion.restar(numero1, numero2));
                    break;
                case 3:
                    System.out.println("\nMultiplicación");
                    System.out.print("Ingrese número1: ");
                    numero1 = scanner.nextFloat();
                    System.out.print("Ingrese número2: ");
                    numero2 = scanner.nextFloat();
                    System.out.println("Resultado: " + funcion.multiplicar(numero1, numero2));
                    break;
                case 4:
                    System.out.println("\nDivisión");
                    System.out.print("Ingrese número1: ");
                    numero1 = scanner.nextFloat();
                    System.out.print("Ingrese número2: ");
                    numero2 = scanner.nextFloat();
                    if (numero2!=0)
                        System.out.println("Resultado: " + funcion.dividir(numero1, numero2));
                    else
                        System.out.println("Resultado: Error no se puede dividir por 0");
                    break;
                case 5:
                    System.out.println("Programa Finalizado\n");
                    break;
                default:
                    System.out.println("Error: " + opcion + " no es una opción válida.\n");
            }
        }
        while (opcion != 5);
        scanner.close();

    }
}

package Tiempo;

import java.util.Scanner;

public class Reloj
{

    public static void main(String[] args) throws InterruptedException {

        int opcion, horas, minutos;
        Scanner scanner = new Scanner(System.in);

        do {

            Funcion funcion = new Funcion();

            System.out.println("\nFunciones");
            System.out.println("=========================");
            System.out.println("1.Cronómetro");
            System.out.println("2.Temporizador");
            System.out.println("3.Salir.");
            System.out.print("Ingrese la opción:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nCronómetro");
                    funcion.cronometro();
                    break;
                case 2:
                    System.out.println("\nTemporizador");
                    System.out.print("Ingrese minutos: ");
                    minutos = scanner.nextInt();
                    funcion.temporizador(minutos-1);
                    System.out.println("Tiempo finalizado");
                    break;
                case 3:
                    System.out.println("Programa Finalizado\n");
                    break;
                default:
                    System.out.println("Error: " + opcion + " no es una opción válida.\n");
            }
        }
        while (opcion != 3);
    }
}

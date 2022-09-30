package QuizSemana1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcion;
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("\nPlantas");
            System.out.println("=========================");
            System.out.println("1.Hierbas");
            System.out.println("2.Matas");
            System.out.println("3.Arbustos");
            System.out.println("4.Árboles");
            System.out.println("5.Salir.");
            System.out.print("Ingrese la opción:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nHierbas");
                    Hierba hierba = new Hierba(1, "Maleza", false, false);
                    System.out.println(hierba.toString());
                    hierba.calcularAltura(1);
                    hierba.crearFlor();
                    hierba.crearFruto();
                    hierba.nacer();
                    hierba.morir();
                    break;
                case 2:
                    System.out.println("\nMatas");
                    Mata mata = new Mata(2, "Salvia", false, true);
                    System.out.println(mata.toString());
                    mata.calcularAltura(2);
                    mata.crearFlor();
                    mata.crearFruto();
                    mata.nacer();
                    mata.morir();
                    break;
                case 3:
                    System.out.println("\nArbustos");
                    Arbusto arbusto = new Arbusto(4, "Romero", false, true);
                    System.out.println(arbusto.toString());
                    arbusto.calcularAltura(4);
                    arbusto.crearFlor();
                    arbusto.crearFruto();
                    arbusto.nacer();
                    arbusto.morir();
                    break;
                case 4:
                    System.out.println("\nÁrboles");
                    Arbol arbol = new Arbol(12, "Manzano", true, false);
                    System.out.println(arbol.toString());
                    arbol.calcularAltura(12);
                    arbol.crearFlor();
                    arbol.crearFruto();
                    arbol.nacer();
                    arbol.morir();
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
package S2Actividad5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcion;
        ArrayList<Informe> informes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("\nInformes");
            System.out.println("=========================");
            System.out.println("1. Agrega 10 informes y muestra su contenido, elimina todo el contenido");
            System.out.println("2. Agrega de nuevo 5 informes.");
            System.out.println("3.Salir.");
            System.out.print("Ingrese la opción:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n10 Informes");

                    // Creamos los informes
                    Informe informe1 = new Informe(002,2);
                    Informe informe2 = new Informe(122,0);
                    Informe informe3 = new Informe(033,1);
                    Informe informe4 = new Informe(021,1);
                    Informe informe5 = new Informe(050,0);
                    Informe informe6 = new Informe(066,0);
                    Informe informe7 = new Informe(054,0);
                    Informe informe8 = new Informe(015,2);
                    Informe informe9 = new Informe(012,1);
                    Informe informe10 = new Informe(111,1);

                    // Agregar los informes a la lista
                    informes.add(informe1);
                    informes.add(informe2);
                    informes.add(informe3);
                    informes.add(informe4);
                    informes.add(informe5);
                    informes.add(informe6);
                    informes.add(informe7);
                    informes.add(informe8);
                    informes.add(informe9);
                    informes.add(informe10);

                    // Recorrer la lista
                    for (Informe i : informes) {
                        System.out.println(i.toString());
                    }

                    // Eliminar la lista
                    for(int i=9; i>=0;i--){
                        informes.remove(i);
                    }
                    break;
                case 2:
                    System.out.println("\n5 Informes");
                    // Creamos los informes
                    Informe informe11 = new Informe(005,2);
                    Informe informe12 = new Informe(010,0);
                    Informe informe13 = new Informe(023,1);
                    Informe informe14 = new Informe(044,1);
                    Informe informe15 = new Informe(007,0);


                    // Agregar los informes a la lista
                    informes.add(informe11);
                    informes.add(informe12);
                    informes.add(informe13);
                    informes.add(informe14);
                    informes.add(informe15);

                    // Recorrer la lista
                    informes.forEach((informe) -> {
                        System.out.println(informe.toString());
                    });

                    break;
                case 3:
                    System.out.println("Programa Finalizado\n");
                    break;
                default:
                    System.out.println("Error: " + opcion + " no es una opción válida.\n");
            }

        }
        while (opcion != 3);
        scanner.close();

    }

}

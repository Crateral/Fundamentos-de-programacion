package S2Actividad5_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcion, codigo, tarea;
        Informes lista = new Informes();
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("\nInformes");
            System.out.println("=========================");
            System.out.println("1. Agregar informe");
            System.out.println("2. consultar informe");
            System.out.println("3. Eliminar informe");
            System.out.println("4. Mostrar informes");
            System.out.println("5. Eliminar informes");
            System.out.println("6. Salir.");
            System.out.print("Ingrese la opción:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nAgregar informe");
                    System.out.print("Ingrese el código: ");
                    codigo = scanner.nextInt();
                    System.out.print("1. Administrativo  2.Empresarial 3.Personal \nIngrese el código: ");
                    tarea = scanner.nextInt();
                    new Informes(codigo, (tarea-1));
                    break;
                case 2:
                    System.out.println("\nConsultar Informes por tarea");
                    System.out.print("1. Administrativo  2.Empresarial 3.Personal \nIngrese el código: ");
                    tarea = scanner.nextInt();
                    lista.consultarInforme((tarea-1));
                    break;
                case 3:
                    System.out.println("\nEliminar Informe");
                    System.out.print("Ingrese el código del informe: ");
                    codigo = scanner.nextInt();
                    lista.eliminarInforme(codigo);
                    break;
                case 4:
                    System.out.println("\nMostrar todos los Informes");
                    lista.mostrarInformes();
                    break;
                case 5:
                    System.out.println("\nEliminar todos los Informes");
                    lista.eliminarInforme();
                    break;
                case 6:
                    System.out.println("Programa Finalizado\n");
                    break;
                default:
                    System.out.println("Error: " + opcion + " no es una opción válida.\n");
            }

        }
        while (opcion != 6);
        scanner.close();
    }

}

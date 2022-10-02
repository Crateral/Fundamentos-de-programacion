package Vehiculo;

//Taller herencia:
//2. Realizar la implementacion de la estructura de un Vehiculos

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcion;
        Scanner scanner = new Scanner(System.in);

        do
        {

        System.out.println("\nVehículos");
        System.out.println("=========================");
        System.out.println("1.Acuático");
        System.out.println("2.Aéreo");
        System.out.println("3.Terrestre");
        System.out.println("4.Salir.");
        System.out.print("Ingrese la opción:");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                scanner.nextLine();
                System.out.println("\nAcuático");
                System.out.print("Ingrese nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese tipo: ");
                String tipo = scanner.nextLine();
                System.out.print("Ingrese color: ");
                String color = scanner.nextLine();
                System.out.print("Ingrese velocidad: ");
                double velocidad = scanner.nextDouble();
                System.out.print("Ingrese capacidad personas: ");
                int capacidadPersonas = scanner.nextInt();
                System.out.print("Ingrese eslora: ");
                double eslora = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Ingrese tipo de propulsión: ");
                String propulsion = scanner.nextLine();
                Acuatico embarcacion = new Acuatico (nombre, tipo, color, velocidad, capacidadPersonas, eslora, propulsion);
                embarcacion.encender();
                embarcacion.avanzar(140);
                embarcacion.detenerse();
                embarcacion.apagar();
                System.out.println(embarcacion.toString());
                break;
            case 2:
                scanner.nextLine();
                System.out.println("\nAéreo");
                System.out.print("Ingrese nombre: ");
                nombre = scanner.nextLine();
                System.out.print("Ingrese tipo: ");
                tipo = scanner.nextLine();
                System.out.print("Ingrese color: ");
                color = scanner.nextLine();
                System.out.print("Ingrese velocidad: ");
                velocidad = scanner.nextDouble();
                System.out.print("Ingrese capacidad personas: ");
                capacidadPersonas = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Ingrese fabricante: ");
                String fabricante = scanner.nextLine();
                Aereo aeronave = new Aereo (nombre, tipo, color, velocidad, capacidadPersonas, fabricante);
                aeronave.encender();
                aeronave.avanzar(320);
                aeronave.detenerse();
                aeronave.apagar();
                System.out.println(aeronave.toString());
                break;
            case 3:
                scanner.nextLine();
                System.out.println("\nTerrestre");
                System.out.print("Ingrese nombre: ");
                nombre = scanner.nextLine();
                System.out.print("Ingrese tipo: ");
                tipo = scanner.nextLine();
                System.out.print("Ingrese color: ");
                color = scanner.nextLine();
                System.out.print("Ingrese velocidad: ");
                velocidad = scanner.nextDouble();
                System.out.print("Ingrese capacidad personas: ");
                capacidadPersonas = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Ingrese marca: ");
                String marca = scanner.nextLine();
                System.out.print("Ingrese tipo combustible: ");
                String tipoCombustible = scanner.nextLine();
                Terrestre terrestre = new Terrestre (nombre, tipo, color, velocidad, capacidadPersonas, marca, tipoCombustible);
                terrestre.encender();
                terrestre.avanzar(50);
                terrestre.detenerse();
                terrestre.apagar();
                System.out.println(terrestre.toString());
                break;
            case 4:
                System.out.println("Programa Finalizado\n");
                break;
            default:
                System.out.println("Error: " + opcion + " no es una opción válida.\n");
            }
        }
        while(opcion !=4);
        scanner.close();
    }
}


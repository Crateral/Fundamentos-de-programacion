package EmpresaTransporte;

//Taller herencia:
//3. Realizar la estructura de una empresa de transporte de mercancia (personal, vehiculos, etc...)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion;
        Scanner scanner = new Scanner(System.in);

        do
        {

            System.out.println("\nEMT Envios");
            System.out.println("=========================");
            System.out.println("1.Empleado");
            System.out.println("2.Cliente");
            System.out.println("3.Envío");
            System.out.println("4.Salir.");
            System.out.print("Ingrese la opción:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine();
                    System.out.println("\nEmpleado");
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Ingrese cedula: ");
                    String cedula = scanner.nextLine();
                    System.out.print("Ingrese telefono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingrese cargo: ");
                    String cargo = scanner.nextLine();
                    System.out.print("Ingrese eps: ");
                    String eps = scanner.nextLine();
                    System.out.print("Ingrese arl: ");
                    String arl = scanner.nextLine();
                    Empleado empleado = new Empleado (nombre, apellido, cedula, telefono, cargo, eps, arl);
                    System.out.println(empleado.toString());
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("\nCliente");
                    System.out.print("Ingrese nombre: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese apellido: ");
                    apellido = scanner.nextLine();
                    System.out.print("Ingrese cedula: ");
                    cedula = scanner.nextLine();
                    System.out.print("Ingrese telefono: ");
                    telefono = scanner.nextLine();
                    System.out.print("Ingrese direccion: ");
                    String direccion = scanner.nextLine();
                    System.out.print("Ingrese código postal: ");
                    String codigoPostal = scanner.nextLine();
                    Cliente cliente = new Cliente (nombre, apellido, cedula, telefono, direccion, codigoPostal);
                    System.out.println(cliente.toString());
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("\nEnvíos");
                    System.out.print("Ingrese Fecha Adminisión: ");
                    String fecha = scanner.nextLine();
                    System.out.print("Ingrese contenido del envío: ");
                    String contenido = scanner.nextLine();
                    System.out.print("Ingrese peso: ");
                    Double peso = scanner.nextDouble();
                    System.out.print("Ingrese precio envío: ");
                    Double costo = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("=========================");
                    System.out.print("Ingrese nombre remitente: ");
                    String nombreR = scanner.nextLine();
                    System.out.print("Ingrese apellido remitente: ");
                    String apellidoR = scanner.nextLine();
                    System.out.print("Ingrese cedula remitente: ");
                    String cedulaR = scanner.nextLine();
                    System.out.print("Ingrese telefono remitente: ");
                    String telefonoR = scanner.nextLine();
                    System.out.print("Ingrese direccion remitente: ");
                    String direccionR = scanner.nextLine();
                    System.out.print("Ingrese código postal remitente: ");
                    String codigoPostalR = scanner.nextLine();
                    System.out.println("=========================");
                    System.out.print("Ingrese nombre destinatario: ");
                    String nombreD = scanner.nextLine();
                    System.out.print("Ingrese apellido destinatario: ");
                    String apellidoD = scanner.nextLine();
                    System.out.print("Ingrese cedula destinatario: ");
                    String cedulaD = scanner.nextLine();
                    System.out.print("Ingrese telefono destinatario: ");
                    String telefonoD = scanner.nextLine();
                    System.out.print("Ingrese direccion destinatario: ");
                    String direccionD = scanner.nextLine();
                    System.out.print("Ingrese código postal destinatario: ");
                    String codigoPostalD = scanner.nextLine();
                    Cliente remitente = new Cliente (nombreR, apellidoR, cedulaR, telefonoR, direccionR, codigoPostalR);
                    Cliente destinatario = new Cliente (nombreD, apellidoD, cedulaD, telefonoD, direccionD, codigoPostalD);
                    Envio envio = new Envio (fecha, contenido, peso, costo, remitente, destinatario);
                    System.out.println("=========================");
                    System.out.print("Ingrese placas vehiculo: ");
                    String placas = scanner.nextLine();
                    System.out.println(envio.toString());
                    envio.asignarVehiculo(placas);
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

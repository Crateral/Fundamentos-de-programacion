package S2Quiz;

// Crear un carrito de compras donde se pueda añadir diferentes productos y poder consultarlos todos,
// consultarlos por categoría, estos productos se deben poder ordenar por precio, por categoría y por nombre

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcion, codigo, idCategoria, cantidad;
        double precio;
        String nombre, observacion;
        CarritoCompra lista = new CarritoCompra();
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("\nCarrito de compra");
            System.out.println("=========================");
            System.out.println("1. Agregar producto");
            System.out.println("2. consultar producto por categoría");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Eliminar productos");
            System.out.println("6. Salir.");
            System.out.print("Ingrese la opción:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nAgregar producto");
                    System.out.print("1.Mercado 2.Tecnología 3.Hogar 4.Moda 5.Ferreteria 6.Farmacia \nIngrese la categoría: ");
                    idCategoria = scanner.nextInt();
                    System.out.print("Ingrese el código: ");
                    codigo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el nombre: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese la cantidad: ");
                    cantidad = scanner.nextInt();
                    System.out.print("Ingrese el precio: ");
                    precio = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese observaciones: ");
                    observacion = scanner.nextLine();
                    new CarritoCompra(codigo, cantidad, nombre, (idCategoria-1), observacion, precio);
                    break;
                case 2:
                    System.out.println("\nConsultar productos por categoría");
                    System.out.print("1.Mercado 2.Tecnología 3.Hogar 4.Moda 5.Ferreteria 6.Farmacia \nIngrese el código: ");
                    idCategoria = scanner.nextInt();
                    lista.consultarCategoria((idCategoria-1));
                    break;
                case 3:
                    System.out.println("\nEliminar Producto");
                    System.out.print("Ingrese el código del producto: ");
                    codigo = scanner.nextInt();
                    lista.eliminarProducto(codigo);
                    break;
                case 4:
                    System.out.println("\nMostrar todos los Productos");
                    lista.mostrarProductos();
                    break;
                case 5:
                    System.out.println("\nEliminar todos los productos");
                    lista.eliminarProducto();
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

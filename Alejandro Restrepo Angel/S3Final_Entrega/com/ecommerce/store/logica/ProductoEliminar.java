package com.ecommerce.store.logica;

import com.ecommerce.store.interfaces.Vistas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductoEliminar extends Productos implements Vistas {

    // Atributos de la clase
    private int codigo, posicion;

    // Método para eliminar por medio del codigo de producto
    private void eliminar(int codigo) {
        // Realiza búsqueda del producto en el arreglo, si lo encuentra devuelve la posición, sino devuelve un -1
        posicion = buscarProducto(codigo);
        if (posicion==-1){
            System.out.println("No se ha encontrado el producto con código [" + codigo + "]");
        }
        else{
            System.out.println("Se ha encontrado el producto");
            mostrarProductos(posicion);
            if(eliminarProducto(posicion)){
                System.out.println("Se ha eliminado correctamente");
            }
            else{
                System.out.println("Ha ocurrido un error, intentalo nuevamente");
            }

        }

    }
    //Vista de eliminar y captura de datos
    @Override
    public void vistaPantalla() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("\n===========================================");
            System.out.println("| Eliminar Producto                       |");
            System.out.println("===========================================");
            System.out.print("Ingrese el código del producto: ");
            codigo = scanner.nextInt();
            eliminar(codigo);
        }
        catch (InputMismatchException excepcion){
            System.out.println("Error! No es una opción válida \n");
            scanner.next();
            codigo = 0;
        }
    }
}

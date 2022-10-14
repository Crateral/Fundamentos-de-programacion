package com.ecommerce.store.logica;

import com.ecommerce.store.beans.Producto;
import com.ecommerce.store.interfaces.Vistas;

import java.util.Scanner;

public class ProductoActualizar extends Productos implements Vistas {

    private int codigo, idCategoria, precio, posicion;
    private String nombre, observacion;

    public void actualizarProducto(int posicion, int codigo, String nombre, int idCategoria, String observacion,int precio) {
        Producto producto = new Producto();
        producto.setCodigo(codigo);
        producto.setNombre(nombre);
        producto.setCategoria(String.valueOf(idCategoria));
        producto.setObservacion(observacion);
        producto.setPrecio(precio);
        System.out.println(producto.toString());
        agregarProducto(posicion, producto);
    }

    @Override
    public void vistaPantalla() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n===========================================");
        System.out.println("Modificar Producto");
        System.out.println("===========================================");
        System.out.print("Ingrese el código del producto: ");
        codigo = scanner.nextInt();
        posicion = buscarProducto(codigo);
        if(posicion!=-1) {
            System.out.println("===========================================");
            mostrarProductos(posicion);
            System.out.println("===========================================");
            System.out.print("Ingrese el código: ");
            codigo = scanner.nextInt();
            System.out.print("Ingrese la catogoría: ");
            idCategoria = scanner.nextInt();
            System.out.print("Ingrese el código: ");
            codigo = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Ingrese el nombre: ");
            nombre = scanner.nextLine();
            System.out.print("Ingrese Observaciones: ");
            observacion = scanner.nextLine();
            System.out.print("Ingrese el precio: ");
            precio = scanner.nextInt();
            actualizarProducto(posicion, codigo, nombre, idCategoria, observacion, precio);
        }
        else{
            System.out.println("No se encontró el producto con código [" + codigo + "]");
        }
    }
}

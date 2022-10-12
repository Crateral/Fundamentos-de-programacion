package com.ecommerce.store.producto;

import java.util.ArrayList;
import java.util.List;

public class ListaProductos extends Producto{

    //Lista de productos
    private static List<Producto> Productos = new ArrayList<>();

    //Constructores
    public ListaProductos() {

    }

    public ListaProductos(int codigo, int cantidad, String nombre, int idCategoria, String observacion, int precio) {
        Productos.add(new Producto(codigo, cantidad, nombre, idCategoria, observacion, precio));
    }

    //Métodos
    public void mostrarProductos() {
        if(!Productos.isEmpty()) {
            // Recorrer la lista
            for (Producto producto : Productos) {
                System.out.println(producto.toString());
            }
        }
        else{
            System.out.println("No hay productos creados! \n");
        }
    }
}

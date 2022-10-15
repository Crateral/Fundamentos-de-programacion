package com.ecommerce.store.logica;

import com.ecommerce.store.beans.Producto;

import java.util.ArrayList;
import java.util.List;

// Clase ListaProductos contiene el manejo del arreglo y los objectos productos
public class Productos extends Producto {

    // Arreglo dinámico de tipo Producto, con acceso privado y estático
    static List<Producto> productos = new ArrayList<>();

    //Atributos de la Clase
    private int posicion;
    private boolean bandera;

    //
    public static void cargarProductos(){
        if(productos.isEmpty()){
            productos.add(new Producto(001, "Papa",  0, "Kilo", 3200));
            productos.add(new Producto(002, "Zanahoria",  0, "Libra", 1200));
            productos.add(new Producto(100, "Celular",  1, "Nokia 1100", 100000));
            productos.add(new Producto(200, "Silla",  2, "Rimax", 19000));
        }
    }

    // Método para ingresar un producto al arreglo
    boolean agregarProducto(Producto producto) {
        bandera = false;
        if(productos.add(producto)){
            bandera = true;
        }
        return bandera;
    }

    // Método para ingresar un producto al arreglo en una posición determinada
    void agregarProducto(int posicion, Producto producto) {
        productos.set(posicion, producto);
    }

    //
    Producto retornaProducto(int posicion){
        return productos.get(posicion);
    }

    // Método para buscar un producto y retornar su posición en el arreglo
    int buscarProducto(int codigo){
        posicion =-1;
        if(!productos.isEmpty()) {
            // Recorrer la lista
            for (int i=0; i < productos.size(); i++) {
                if(productos.get(i).getCodigo()==codigo){
                    posicion = i;
                }
            }
        }
        return posicion;
    }

    // Método para eliminar un producto por medio de su posición
    boolean eliminarProducto(int posicion){
        bandera = false;
        if(productos.remove(productos.get(posicion))){
            bandera = true;
        }
        return bandera;
    }

    // Método para imprimir los productos en pantalla
    public void mostrarProductos() {
        if(!productos.isEmpty()) {
            // Recorrer la lista
            for (Producto producto : productos) {
                System.out.println(producto.toString());
            }
        }
        else{
            System.out.println("No hay productos creados! \n");
        }
    }

    // Método para imprimir un producto de una posición pasada por parámetro
    public void mostrarProductos(int posicion) {
        System.out.println(productos.get(posicion).toString());
    }

}

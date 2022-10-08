package S2Quiz_2;

import java.util.*;

public class CarritoCompra extends Producto {

    //Lista de productos
    private static List<Producto> CarritoCompra = new ArrayList<>();

    //Constructores
    public CarritoCompra() {
    }

    public CarritoCompra(int codigo, int cantidad, String nombre, int idCategoria, String observacion, int precio) {
        CarritoCompra.add(new Producto(codigo, cantidad, nombre, idCategoria, observacion, precio));
    }

    //Métodos
    public void consultarCategoria(int idCategoria){
        boolean flag = false;
        String categoria = this.categorias[idCategoria];
        if(!CarritoCompra.isEmpty()){
            for (Producto producto : CarritoCompra) {
                if(producto.getCategoria().equals(categoria)){
                    System.out.println(producto.toString());
                    flag = true;
                }
            }
            if(flag == false){
                System.out.println("No se encontró ningún producto");
            }
        }
        else{
            System.out.println("El carrito está vacío");
        }
    }

    public void eliminarProducto(int codigo){
        boolean flag = false;
        if(!CarritoCompra.isEmpty()) {
            // Recorrer la lista
            for (int i = 0; i < CarritoCompra.size(); i++) {
                if (CarritoCompra.get(i).getCodigo() == codigo) {
                    CarritoCompra.remove(i);
                    flag = true;
                    System.out.println("Se ha eliminado el producto con el código[" + codigo + "]");
                }
            }
            if(flag == false){
                System.out.println("No se encontró ningún producto");
            }
        }
        else{
            System.out.println("El carrito está vacío");
        }
    }

    public void eliminarProducto(){
        if(!CarritoCompra.isEmpty()) {
            // Eliminar la lista
            // Utilizando el método de los ArrayList CarritoCompra.clear();
            //
            for (int i = 0; i < CarritoCompra.size(); i++) {
                CarritoCompra.remove(i);
            }
            System.out.println("Se ha limpiado la lista del carrito");
        }
        else{
            System.out.println("El carrito está vacío");
        }
    }

    public void ordenarProductos(int atributo) {
        Producto auxiliar;
        if(!CarritoCompra.isEmpty()) {
            // Ordenar la lista
            if (atributo==1){
                //Ordenamiento de mayor a menor
                for (int i = 0; i < CarritoCompra.size(); i++) {
                    for (int j = i; j < CarritoCompra.size(); j++) {
                        if (CarritoCompra.get(i).getPrecio() < CarritoCompra.get(j).getPrecio()) {
                            auxiliar = CarritoCompra.get(i);
                            CarritoCompra.set(i, CarritoCompra.get(j));
                            CarritoCompra.set(j, auxiliar);
                        }
                    }
                }
                mostrarProductos();
            }
            if (atributo==2){
                Collections.sort(CarritoCompra, new Comparator<Producto>() {
                    @Override
                    public int compare(Producto o1, Producto o2) {
                        return o1.getCategoria().compareTo(o2.getCategoria());
                    }
                });
               mostrarProductos();
            }
            if (atributo==3){
                Collections.sort(CarritoCompra, new Comparator<Producto>() {
                    @Override
                    public int compare(Producto o1, Producto o2) {
                        return o1.getNombre().compareTo(o2.getNombre());
                    }
                });
                mostrarProductos();
            }
        }
        else{
            System.out.println("El carrito está vacío");
        }
    }


    public void mostrarProductos(){
        if(!CarritoCompra.isEmpty()) {
            // Recorrer la lista
            for (Producto producto : CarritoCompra) {
                System.out.println(producto.toString());
            }
        }
        else{
            System.out.println("El carrito está vacío");
        }
    }

}

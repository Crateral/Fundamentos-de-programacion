package S2Quiz;

import java.util.ArrayList;

public class CarritoCompra extends Producto{

    //Lista de productos
    private static ArrayList<Producto> CarritoCompra = new ArrayList<>();

    //Constructores
    public CarritoCompra() {
    }

    public CarritoCompra(int codigo, int cantidad, String nombre, int idCategoria, String observacion, double precio) {
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

    public void ordenarProductos(int atributo, int orden) {
        Producto auxiliar;
        if(!CarritoCompra.isEmpty()) {
            // Ordenar la lista


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

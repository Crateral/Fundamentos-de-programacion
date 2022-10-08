package S2Quiz_2;

public class Producto {

    //Atributos
    public final String[] categorias={"Mercado", "Tecnología", "Hogar", "Moda", "Ferreteria", "Farmacia"};

    private int codigo, cantidad, precio;

    private String nombre, categoria, observacion;

    //Constructores
    public Producto() {
        this.codigo = 0;
        this.cantidad = 0;
        this.nombre = "";
        this.categoria = "";
        this.observacion = "";
        this.precio = 0;
    }

    public Producto(int codigo, int cantidad, String nombre, int idCategoria, String observacion, int precio) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.categoria = this.categorias[idCategoria];
        this.observacion = observacion;
        this.precio = precio;
    }

    //Getter y setter
    public String[] getCategorias() {
        return categorias;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //Método para imprimir en pantalla
    @Override
    public String toString() {
        return "Producto{" +
                "categoria='" + categoria + '\'' +
                ", codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                ", observacion='" + observacion + '\'' +
                '}';
    }

}


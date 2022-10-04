package EmpresaTransporte;

public class Cliente extends Persona{

    protected String direccion, codigoPostal;

    public Cliente() {
        super();
        this.direccion = "";
        this.codigoPostal = "";
    }

    public Cliente(String nombre, String apellido, String cedula, String telefono, String direccion, String codigoPostal) {
        super(nombre, apellido, cedula, telefono);
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                '}';
    }
}

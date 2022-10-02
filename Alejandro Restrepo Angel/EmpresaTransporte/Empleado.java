package EmpresaTransporte;

public class Empleado extends Persona{

    protected String cargo, eps, arl;

    public Empleado() {
        super();
        this.cargo = cargo;
        this.eps = eps;
        this.arl = arl;
    }

    public Empleado(String nombre, String apellido, String cedula, String telefono, String cargo, String eps, String arl) {
        super(nombre, apellido, cedula, telefono);
        this.cargo = cargo;
        this.eps = eps;
        this.arl = arl;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getArl() {
        return arl;
    }

    public void setArl(String arl) {
        this.arl = arl;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cargo='" + cargo + '\'' +
                ", eps='" + eps + '\'' +
                ", arl='" + arl + '\'' +
                '}';
    }
}

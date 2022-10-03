package domain;

public class empleado extends persona 
{
    private int idEmpleado;
    private double sueldo;
    private static int  contadorEmpleado;

    public empleado(String nombre, double sueldo) {
        super (nombre); 
        this.sueldo = sueldo;
        this.idEmpleado = ++empleado.contadorEmpleado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }
   
    public double getSueldo() {
        return sueldo;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado(idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString());
        StringBuilder append = sb.append('}');
        return sb.toString();
        
    }

    
    
    
    

    
    
}

    

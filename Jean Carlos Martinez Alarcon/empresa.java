
package domain;


public class empresa
{
	private String nombre;
	private int nit;
	private String direccion;
    // lo que es privado no se hereda a las clases hijas // 
		
	public empresa(){
		 			
	}   
        
        public empresa(String nombre)
	{
        this.nombre = nombre;
	}

        public empresa(String nombre, int nit, String direccion) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNit() {
        return this.nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String toString() {
        return "empresa{" + "nombre=" + nombre + ", nit=" + nit + ", direccion=" + direccion + '}';
    }
        
  
}

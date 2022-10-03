
package domain;


    public class persona 
{
        protected String nombre;
	protected int edad;
	protected String direccion;
        protected char genero;
        
        public persona (){
               
        }
        
        public persona(String nombre){
            this.nombre = nombre;
        }

    public persona(String nombre, int edad, String direccion, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.genero = genero;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
        @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + ", genero=" + genero + '}';
    }
        
        
}

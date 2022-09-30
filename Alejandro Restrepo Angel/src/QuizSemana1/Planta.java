package QuizSemana1;

public abstract class Planta {

    //Atributos
    protected double altura;
    protected String nombre;
    protected boolean fruto, flores;

    //Constructores
    public Planta() {
        this.altura = 0.0;
        this.nombre = "";
        this.fruto = false;
        this.flores = false;
    }
    public Planta(double altura, String nombre, boolean fruto, boolean flores) {
        this.altura = altura;
        this.nombre = nombre;
        this.fruto = fruto;
        this.flores = flores;
    }

    //Getter y Setter
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isFruto() {
        return fruto;
    }

    public void setFruto(boolean fruto) {
        this.fruto = fruto;
    }

    public boolean isFlores() {
        return flores;
    }

    public void setFlores(boolean flores) {
        this.flores = flores;
    }

    //Métodos
    protected void calcularAltura(double altura){
       if (altura >= 5){
           System.out.println("Está planta tiene el tamaño de un árbol");
       }
       else if(altura>=3){
           System.out.println("Está planta tiene el tamaño de un arbusto");
       }
       else if(altura>1){
           System.out.println("Está planta tiene el tamaño de un Mata");
       }
       else if(altura<=1) {
           System.out.println("Está planta tiene el tamaño de un Hierba");
       }
   }

   protected void crearFlor(){
        if(isFlores()==true)
            System.out.println("La planta está floreciendo");
        else
            System.out.println("La planta no da flores");
   }

   protected void crearFruto(){
       if(isFruto()==true)
           System.out.println("La planta da frutos");
       else
           System.out.println("La planta no da frutos");
   }

   //Método toString
    @Override
    public String toString() {
        return "Planta{" +
                "nombre='" + nombre +
                ", altura=" + altura +
                ", fruto=" + fruto +
                ", flores=" + flores +
                '}';
    }
}

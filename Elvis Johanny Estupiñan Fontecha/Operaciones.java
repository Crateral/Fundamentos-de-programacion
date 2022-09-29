package Ejercicio1;
public class Operaciones {

    private Integer resultado;

    public Operaciones() {
    }

    public int suma(int num1, int num2){
        resultado=num1+num2;
        return resultado;
    }

    public int resta(int num1, int num2){
        resultado=num1-num2;
        return resultado;
    }

    public int multiplicacion(int num1, int num2){
        resultado=num1*num2;
        return resultado;
    }

    public int division(int num1, int num2){
        if(num1==0){
            System.out.println("El resultado es 0");
        }else if(num2==0){
            System.out.println("No es posible dividir entre 0");
        }else{
            resultado=num1/num2;
            System.out.println("el resultado de la división es: "+ resultado);
        }
        return resultado;

    }
}
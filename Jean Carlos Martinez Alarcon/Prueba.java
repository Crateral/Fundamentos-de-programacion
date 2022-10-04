
package test;

import domain.cliente;
import domain.empleado;
import java.util.Date;



public class Prueba {
    
    public static void main(String[] args) {
//         empleado empleado1 = new empleado ("juan", 1000);
//         System.out.print("empleado1 = " + empleado1);
             
            Date fecha = new Date ();
            cliente cliente1;
            cliente1 = new cliente(fecha);
            System.out.println("cliente1 = " + cliente1);
    }
    
}


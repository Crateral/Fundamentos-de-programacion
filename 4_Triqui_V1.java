/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triqui;

/**
 *
 * @author DIEGO ESTACIO
 */
import java.util.Scanner;

public class Triqui {

    static boolean ban =false;
    
    public static void main(String[] ar) {
        Triqui ma = new Triqui();
        ma.cargar();
        ma.imprimir();

        do{
          ma.cargar2();
          ma.comprobar();
          ma.imprimir();
        }while(true!=ban);
        
        
        
    }

    private Scanner teclado;
    private int[][] matriz;

    public void cargar() {
        int filas = 3;
        int columnas = 3;
        matriz = new int[filas][columnas];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {

                this.matriz[f][c] = 7;
            }
        }
    }
    
        public void cargar2() {
        teclado=new Scanner(System.in);
        System.out.print("Escoge fila casilla:");
        int filas=teclado.nextInt()-1;
        System.out.print("Escoge columna casilla:");
        int columnas=teclado.nextInt()-1;
        matriz[filas][columnas]=0;
  
    }

    
    
    public void imprimir() {
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }

    public void comprobar() {
        
        if (matriz[0][0] + matriz[0][1] + matriz[0][2] == 0 ) {
            System.out.println("Ganador O");
            bloquear();
        }
    }
    
     public void bloquear(){
          boolean ban =true;
	    System.exit(1);
	    }

}

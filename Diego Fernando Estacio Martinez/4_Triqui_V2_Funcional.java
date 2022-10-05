/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triqui;


 // TRIQUI PONDRA UN 1 PARA X - 0 PARA O 
 // POR EL MOMENTO SOLO ESCOGER VALORES QUE ESTEN DENTRO DE LA MATRIZ (1-3)
 // FALTA POR VALIDAR VALOR DE ENTRADA DE 1 A 3
 
 
import java.util.Scanner;

public class Triqui {

    static boolean ban = false;

    public static void main(String[] ar) {
        Triqui ma = new Triqui();
        ma.cargar();
        ma.imprimir();

        do {
            ma.cargar2();
            ma.comprobar();
            ma.imprimir();
            ma.cargar3();
            ma.comprobar();
            ma.imprimir();
        } while (true != ban);

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
        boolean ban2 = false;
        do {
            teclado = new Scanner(System.in);
            System.out.print("Escoge fila casilla Jugador O:  ");
            int filas = teclado.nextInt() - 1;
            System.out.print("Escoge columna casilla Jugador O:  ");
            int columnas = teclado.nextInt() - 1;
            if (matriz[filas][columnas] == 7) {
                matriz[filas][columnas] = 0;
                ban2 = true;
            }
        } while (true != ban2);

    }

    public void cargar3() {
        boolean ban2 = false;
        do {
            teclado = new Scanner(System.in);
            System.out.print("Escoge fila casilla libre Jugador X(1):  ");
            int filas = teclado.nextInt() - 1;
            System.out.print("Escoge columna casilla libre  Jugador X(1):  ");
            int columnas = teclado.nextInt() - 1;
            if (matriz[filas][columnas] == 7) {
                matriz[filas][columnas] = 1;
                ban2 = true;
            }
        } while (true != ban2);

    }

    public void imprimir() {
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print(matriz[f][c] + "   ");
            }
            System.out.println();
            System.out.println();
        }
    }

    public void comprobar() {

        if (matriz[0][0] + matriz[0][1] + matriz[0][2] == 0
                || matriz[1][0] + matriz[1][1] + matriz[1][2] == 0
                || matriz[2][0] + matriz[2][1] + matriz[2][2] == 0
                || matriz[0][0] + matriz[1][0] + matriz[2][0] == 0
                || matriz[0][1] + matriz[1][1] + matriz[2][1] == 0
                || matriz[0][2] + matriz[1][2] + matriz[2][2] == 0
                || matriz[0][0] + matriz[1][1] + matriz[2][2] == 0
                || matriz[2][0] + matriz[1][1] + matriz[1][2] == 0) {
            System.out.println("Ganador O");
            bloquear();
        }
        if (matriz[0][0] + matriz[0][1] + matriz[0][2] == 3
                || matriz[1][0] + matriz[1][1] + matriz[1][2] == 3
                || matriz[2][0] + matriz[2][1] + matriz[2][2] == 3
                || matriz[0][0] + matriz[1][0] + matriz[2][0] == 3
                || matriz[0][1] + matriz[1][1] + matriz[2][1] == 3
                || matriz[0][2] + matriz[1][2] + matriz[2][2] == 3
                || matriz[0][0] + matriz[1][1] + matriz[2][2] == 3
                || matriz[2][0] + matriz[1][1] + matriz[1][2] == 3) {
            System.out.println("Ganador O");
            bloquear();
        }
        
        
        
        
    }

    public void bloquear() {
        boolean ban = true;
        System.exit(1);
    }

}

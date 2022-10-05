package S2Actividad1;

import java.util.Scanner;

public class Triqui {

    public static void main(String[] args) {

        String[][] triqui = { {" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "} };
        int fila, columna;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nTriqui");
        System.out.println("---------------");
        for (int i = 0; i < triqui.length; ++i) {
            System.out.print((i+1) + "| ");
            for(int j = 0; j < triqui[i].length; ++j) {
                System.out.print(triqui[i][j] + " | ");
            }
            System.out.println("\n--------------");
        }
        System.out.println(" | 1 | 2 | 3 |");

        for(int jugadas=0;jugadas<9;jugadas++){

            if(jugadas%2==0){
                System.out.println("\nJugada["+ (jugadas+1) +"] Primer jugador [ X ] - ingrese las coordenadas");
                System.out.print("Ingrese Fila [1-3]: ");
                fila = scanner.nextInt();
                System.out.print("Ingrese Columna [1-3]: ");
                columna = scanner.nextInt();
                if(((fila<1)||(fila>3))||((columna<1)||(columna>3))){
                    System.out.println("\nError! - Ingresa una coordenada valida");
                    jugadas--;
                    continue;
                }
                if(triqui[fila-1][columna-1].equals(" ")){
                    triqui[fila-1][columna-1] = "X";
                }
                else{
                    System.out.println("\nError casilla ocupada! - Ingresa nuevamente las coordenadas");
                    jugadas--;
                }

            }
            else{
                System.out.println("\nJugada["+ (jugadas+1) +"] Segundo jugador [ O ] - ingrese las coordenadas");
                System.out.print("Ingrese Fila [1-3]: ");
                fila = scanner.nextInt();
                System.out.print("Ingrese Columna [1-3]: ");
                columna = scanner.nextInt();
                if(((fila<1)||(fila>3))||((columna<1)||(columna>3))){
                    System.out.println("\nError! - Ingresa una coordenada valida");
                    jugadas--;
                    continue;
                }
                if (triqui[fila-1][columna-1].equals(" ")) {
                    triqui[fila - 1][columna - 1] = "O";
                }
                else{
                    System.out.println("\nError casilla ocupada! - Ingresa nuevamente las coordenadas");
                    jugadas--;
                }
            }

            System.out.println("\nTriqui");
            System.out.println("---------------");
            for (int i = 0; i < triqui.length; ++i) {
                System.out.print((i+1) + "| ");
                for(int j = 0; j < triqui[i].length; ++j) {
                    System.out.print(triqui[i][j] + " | ");
                }
                System.out.println("\n--------------");
            }
            System.out.println(" | 1 | 2 | 3 |");
        }

        scanner.close();
    }
}

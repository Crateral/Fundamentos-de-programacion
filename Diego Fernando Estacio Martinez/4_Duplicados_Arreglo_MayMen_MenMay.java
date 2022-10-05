/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.Principal;

/**
 *
 * @author DIEGO ESTACIO
 */
public class Principal {

    public static void main(String[] args) {

        int a[] = {2, 4, 6, 6, 19, 19, 2, 0, 5, 2, 9};
        int n = a.length;
        //int [] b= new int[a.length];

        System.out.println(" Arreglo con repetidos ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println(" ");

        // ordenar
        for (int x = 0; x < a.length; x++) {
            for (int y = 1; y < (a.length - x); y++) {
                if (a[y - 1] > a[y]) {
                    int temp = a[y - 1];
                    a[y - 1] = a[y];
                    a[y] = temp;
                }
            }
        }

        //termina ordenar
        // elimina repetidos
        int[] t = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                t[j++] = a[i];
            }
        }

        t[j++] = a[n - 1];
        int[] t2 = new int[j];

        System.out.println(" Arreglo sin repetidos ordenado menor a mayor");
        for (int i = 0; i < j; i++) {
            a[i] = t[i];
            System.out.print(a[i] + "  ");
            t2[i] = a[i];
        }


        System.out.println("");
        System.out.println(" Arreglo sin repetidos ordenado mayor a menor");
        /* for (int i = 0; i < j; i++) {
            System.out.print(t2[i]+ "  ");
        }*/

        for (int x = 0; x < t2.length; x++) {
            for (int y = 1; y < (t2.length - x); y++) {
                if (a[y - 1] < t2[y]) {
                    int temp = t2[y - 1];
                    t2[y - 1] = t2[y];
                    t2[y] = temp;
                }
            }
        }
        
        for (int i = 0; i < j; i++) {
            System.out.print(t2[i]+ "  ");
        }
        

    }
}

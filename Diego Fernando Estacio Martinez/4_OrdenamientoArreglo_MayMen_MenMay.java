/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

/**
 *
 * @author DIEGO ESTACIO
 */
public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here

        //1 1
        int[] a = {7, 20, 2, 1, 10, 5, 6};

        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < (a.length - i); j++) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("");
        System.out.print("Menor a Mayor  ");
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " - ");
        }
        System.out.println("");

        //1 2
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < (a.length - i); j++) {
                if (a[j - 1] < a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.print("Mayor a Menor  ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " - ");
        }

        

      
    }
}

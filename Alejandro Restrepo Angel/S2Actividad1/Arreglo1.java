package S2Actividad1;

/*
 *  1. Crear un arreglo con los siguientes valores:
 *      7, 4, 2, 1,10, 5, 6
 *      1.1 Ordenar el arreglo de menor a mayor
 *      1.2 Ordenar el arreglo de mayor a menor
*/

public class Arreglo1 {


    //Método mostrar arreglo
    public static void mostrarArreglo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arreglo = {7, 4, 2, 1,10, 5, 6};
        int[] arreglo1 = {7, 4, 2, 1,10, 5, 6};
        int[] arreglo2 = {7, 4, 2, 1,10, 5, 6};

        int auxiliar, contador=0;

        //Arreglo Original
        System.out.print("\nArreglo: ");
        mostrarArreglo(arreglo);

        //Ordenamiento de menor a mayor
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = i; j < arreglo1.length; j++) {
                if (arreglo1[i] > arreglo1[j]){
                    auxiliar = arreglo1[i];
                    arreglo1[i] = arreglo1[j];
                    arreglo1[j] = auxiliar;
                }
            }
        }

        //Arreglo Ordenado
        System.out.print("\nArreglo ordenado de menor a mayor: ");
        mostrarArreglo(arreglo1);

        //Ordenamiento de mayor a menor
        for (int i = 0; i < arreglo2.length; i++) {
            for (int j = i; j < arreglo2.length; j++) {
                if (arreglo2[i] < arreglo2[j]){
                    auxiliar = arreglo2[i];
                    arreglo2[i] = arreglo2[j];
                    arreglo2[j] = auxiliar;
                }
            }
        }

        //Arreglo Ordenado
        System.out.print("\nArreglo ordenado de mayor a menor: ");
        mostrarArreglo(arreglo2);

    }

}

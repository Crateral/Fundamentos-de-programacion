package S2Actividad1;

/*
 *  2. Crear un arreclo con los giuientes valores:
 *	    2,4,6,6,19,3,1,0,5,2,9
 *	    2.1 Eliminar los números duplicados
 *	    2.2 Ordenar el arreglo sin duplicador de menor a mayor
 *	    2.3 Ordenar el arreglo sin duplicados de mayor a menor
*/

public class Arreglo2 {

    //Cantidad números no repetidos
    public static int cantidadNoRepetidos(int[] repetidos){
        int elementos = repetidos.length;
        //Arreglo Sin repetidos
        for (int i = 0; i < repetidos.length; i++) {
            for (int j = i+1; j < (repetidos.length); j++) {
                if (repetidos[i] == repetidos[j]){
                    elementos--;
                }
            }
        }
        return elementos;
    }

    //Arreglo sin números repetidos
    public static int[] noRepetidos(int[] repetidos,int elementos){
        int[] noRepetidos = new int[elementos];
        //Arreglo Sin repetidos
        for (int i = 0; i < elementos; i++) {
            for (int j = i+1; j < repetidos.length; j++) {
                if (repetidos[i] == repetidos[j]){
                    for (int k = j+1; k < repetidos.length; k++) {
                        repetidos[j] = repetidos[k++];
                    }
                }
                noRepetidos[i] = repetidos[i];
            }
        }
        return noRepetidos;
    }

    //Métodos de ordenamiento
    public static int[] menorMayor(int [] arreglo){

        int[] arreglo1 = arreglo;
        int auxiliar;

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
        return arreglo1;
    }

    public static int[] mayorMenor(int [] arreglo){

        int[] arreglo2 = arreglo;
        int auxiliar;

        //Ordenamiento de mayor a menor
        for (int i = 0; i < arreglo2.length; i++) {
            for (int j = i; j < arreglo2.length; j++) {
                if (arreglo2[i] < arreglo2[j]) {
                    auxiliar = arreglo2[i];
                    arreglo2[i] = arreglo2[j];
                    arreglo2[j] = auxiliar;
                }
            }
        }
        return arreglo2;
    }

    //Método mostrar arreglo
    public static void mostrarArreglo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arreglo = {2,4,6,6,19,3,1,0,5,2,9};
        int elementos= cantidadNoRepetidos(arreglo);

        //Arreglo Original
        System.out.print("\nArreglo: ");
        mostrarArreglo(arreglo);

        //Arreglo sin repetidos
        System.out.print("\nElementos sin repetir: " + cantidadNoRepetidos(arreglo));
        System.out.print("\nArreglo sin repetidos: ");
        mostrarArreglo(noRepetidos(arreglo, elementos));

        //Arreglo Menor a Mayor
        System.out.print("\nArreglo ordenado de menor a mayor: ");
        mostrarArreglo(menorMayor(noRepetidos(arreglo, elementos)));

        //Arreglo Mayor a menor
        System.out.print("\nArreglo ordenado de mayor a menor: ");
        mostrarArreglo(mayorMenor(noRepetidos(arreglo, elementos)));
    }

}


package informes;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;
//import java.util.Set;

/**
 *
 * @author DIEGO ESTACIO
 */
public class Principal {

    public static void main(String[] args) {

        Principal pri = new Principal();
//        Informe info = new Informe();

        pri.cargarInformacion();
 //       String b = "personal";

    }

    public void cargarInformacion() {
        List<Informe> informes = new ArrayList<>();
        int numindice = (int) (Math.random() * 3);
        /*       
        
        Informe informe1 = new Informe(1, numindice);
        informes.add(informe1);

        numindice = (int) (Math.random() * 3);
        Informe informe2 = new Informe(2, numindice);
        informes.add(informe2);
         */

        int n = 10;
        Informe[] informes2 = new Informe[n];
        for (int i = 0; i < n; i++) {
            numindice = (int) (Math.random() * 3);
            informes2[i] = new Informe(i, numindice);
            informes.add(informes2[i]);
        }

        /*
    Iterator<Informe> it= informes.iterator();
    while(it.hasNext()) {
      
      System.out.println(it.next());
    }
         
        String busqueda = "administrativo";
        boolean existe = informes.contains(busqueda);

        if (existe) {
            System.out.println("El elemento SÍ existe en la lista");
        } else {
            System.out.println("El elemento no existe");
        }*/
        for (Informe x : informes) {
            System.out.println(x.imprime());
        }

        System.out.println("  ");
        System.out.println(" - Busca personal - ");
        int i = 0;
        while (i < informes.size()) {
            if (informes.get(i).getTarea() == "personal") {
                System.out.println(" El informe con el codigo " + informes.get(i).getCodigo() + " Corresponde a " + informes.get(i).getTarea());
                i++;
            } else {
                i++;
            }
        }
        /*
        for (Informe x : informes2) {
            System.out.println(x.imprime());
        }
         */ System.out.println("  ");
        System.out.println(" - Borra elementos - ");
        informes.clear();
        System.out.println(informes);

        int n2 = 5;
        for (int z = 0; z < n2; z++) {
            numindice = (int) (Math.random() * 3);
            informes2[z] = new Informe(z, numindice);
            informes.add(informes2[z]);
        }

        System.out.println("  ");
        System.out.println(" - Imprime 5 elementos ");

        for (Informe x : informes) {
            System.out.println(x.imprime());
        }

    }

}

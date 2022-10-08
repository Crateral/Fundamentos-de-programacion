package S2Actividad5_2;

import java.util.ArrayList;

public class Informes extends Informe{

    private static ArrayList<Informe> informes = new ArrayList<>();

    public Informes() {

    }
    public Informes(int codigo, int indiceTarea) {
        informes.add(new Informe(codigo, indiceTarea));
    }

    public void consultarInforme(int indiceTarea){
        boolean flag = false;
        String tarea = this.tareas[indiceTarea];
        if(!informes.isEmpty()){
            for (Informe i : informes) {
                if(i.getTarea().equals(tarea)){
                    System.out.println(i.toString());
                    flag = true;
                }
            }
            if(flag == false){
                System.out.println("No se encontró informe creado");
            }
        }
        else{
            System.out.println("No se encontró informes creados");
        }


    }

    public void eliminarInforme(int codigo){
        boolean flag = false;
        if(!informes.isEmpty()) {
            // Recorrer la lista
            for (int i = 0; i < informes.size(); i++) {
                if (informes.get(i).getCodigo() == codigo) {
                    informes.remove(i);
                    flag = true;
                    System.out.println("Se ha eliminado el informe con el código[" + codigo + "]");
                }
            }
            if(flag == false){
                System.out.println("No se encontró informe creado");
            }
        }
        else{
            System.out.println("No se encontró informes creados");
        }
    }

    public void eliminarInforme(){
        if(!informes.isEmpty()) {
            // Eliminar la lista simulando el último en entrar, es el primero en salir
            for (int i = (informes.size()-1); i >= 0; i--) {
                informes.remove(i);
            }
            System.out.println("Se ha eliminado toda la lista");
        }
        else{
            System.out.println("No se encontró informes creados");
        }
    }

    public void mostrarInformes(){
        if(!informes.isEmpty()) {
            // Recorrer la lista
            for (Informe i : informes) {
                System.out.println(i.toString());
            }
        }
        else{
            System.out.println("No se encontró informes creados");
        }
    }

}

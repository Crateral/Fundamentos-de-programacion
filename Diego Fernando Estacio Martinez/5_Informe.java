/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package informes;

/**
 *
 * @author F3R_OM
 */


public class Informe {

    public Informe() {
    }
    
    private final String[] tareas={"administrativo", "empresarial", "personal"};

    private int codigo;
    private String tarea;

    public Informe(int codigo, int indiceTarea) {
        this.codigo = codigo;
        this.tarea = this.tareas[indiceTarea];
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

   

    public String imprime(){


    return " Informe con codigo  " + codigo + " tiene la tarea de  " + tarea ;
    
}
    
    
    public String buscar(String busca){
        if(tarea.equals(busca)){
            return " Informe con codigo  " + codigo + " tiene la tarea de  " + tarea ;
        } else {
            return " ";
        }
         
    }
    

    
}

package com.ecommerce.store.logica;

import com.ecommerce.store.beans.Usuario;

import java.util.ArrayList;
import java.util.List;

// Clase ListaUsuarios contiene el manejo del arreglo y los objectos usuarios
public class Usuarios extends Usuario {


    // Arreglo dinámico de tipo Usuario, con acceso privado y estático
    private static List<Usuario> usuarios = new ArrayList<>();

    //Variables de la Clase, para el manejo de la posición de los objetos
    private int posicion;

    // Método para ingresar un usuario al arreglo
    void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    //Método para buscar un usuario
    int buscarUsuario(String id){
        posicion =-1;
        if(!usuarios.isEmpty()) {
            // Recorrer la lista
            for (int i=0; i < usuarios.size(); i++) {
                if(id.equals(usuarios.get(i).getId())){
                    posicion = i;
                }
            }
        }
        return posicion;
    }

    // Método para imprimir los usuario en pantalla
    public void mostrarUsuarios() {
        if(!usuarios.isEmpty()) {
            // Recorrer la lista
            for (Usuario usuario : usuarios) {
                System.out.println(usuario.toString());
            }
        }
        else{
            System.out.println("No hay usuarios creados! \n");
        }
    }

    // Método para recuperar la contraseña
    void recuperarPassword(String id){
        posicion = buscarUsuario(id);
        System.out.println("Tu contraseña es: " + usuarios.get(posicion).getPassword());
    }

    // Método para cambiar la contraseña
    void cambiarPassword(String id, String nuevoPassword){
        posicion = buscarUsuario(id);
        usuarios.get(posicion).setPassword(nuevoPassword);
        System.out.println("Tu nueva contraseña es: " + usuarios.get(posicion).getPassword());

    }
}

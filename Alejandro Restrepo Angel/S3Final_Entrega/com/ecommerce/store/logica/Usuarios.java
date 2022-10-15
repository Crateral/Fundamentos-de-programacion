package com.ecommerce.store.logica;

import com.ecommerce.store.beans.Estado;
import com.ecommerce.store.beans.Rol;
import com.ecommerce.store.beans.Usuario;
import com.ecommerce.store.principal.MainAdmin;
import com.ecommerce.store.principal.MainUser;

import java.util.ArrayList;
import java.util.List;

// Clase ListaUsuarios contiene el manejo del arreglo y los objectos usuarios
public class Usuarios extends Usuario {


    // Arreglo dinámico de tipo Usuario, con acceso privado y estático
    private static List<Usuario> usuarios = new ArrayList<>();

    //Variables de la Clase, para el manejo de la posición de los objetos
    private int posicion;

    //
    public static void cargarUsuarios(){
        if(usuarios.isEmpty()){
            usuarios.add(new Usuario("001", "admin@mail.com","Admin",  "1234", Rol.ADMIN, Estado.INACTIVO));
            usuarios.add(new Usuario("002", "ntt@mail.com","nttdata",  "1234", Rol.ADMIN, Estado.ACTIVO));
            usuarios.add(new Usuario("003", "user@mail.com","user",  "1234", Rol.USER, Estado.INACTIVO));
            usuarios.add(new Usuario("004", "alo@mail.com","alo",  "1234", Rol.USER, Estado.ACTIVO));
        }
    }

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

    //
    void iniciarSesion(String id, String password) {
        posicion = buscarUsuario(id);
        if((posicion!=-1) && ((usuarios.get(posicion).getEstado()).equals(Estado.ACTIVO))) {
            if ((usuarios.get(posicion).getPassword()).equals(password)) {
                if((usuarios.get(posicion).getRol()).equals(Rol.ADMIN)){
                    MainAdmin dashAdmin = new MainAdmin();
                    dashAdmin.vistaPantalla();
                }
                else if ((usuarios.get(posicion).getRol()).equals(Rol.USER)){
                    MainUser dashUser = new MainUser();
                    dashUser.vistaPantalla();
                }
            } else {
                System.out.println("Contraseña incorrecta");
            }
        }
        else
        {
            System.out.println("No existe el usuario");
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

    void cambiarEstado(String id){
        posicion = buscarUsuario(id);
        if(posicion!=-1) {
            if ((usuarios.get(posicion).getEstado()).equals(Estado.ACTIVO)) {
                usuarios.get(posicion).setEstado(Estado.INACTIVO);
            } else {
                usuarios.get(posicion).setEstado(Estado.ACTIVO);
            }
            System.out.println(usuarios.get(posicion).toString());
        }
        else {
            System.out.println("No existe el usuario");
        }
    }
}

package com.co.nttdata.ecommerce.interfaces;

import com.co.nttdata.ecommerce.entidades.Administrador;
import com.co.nttdata.ecommerce.entidades.Cliente;
import com.co.nttdata.ecommerce.entidades.Usuario;

public interface IGestionLogin {
    public void registrUsuario(Cliente cliente, Administrador administrador);
    public void inicioDeSesion(Cliente cliente, Administrador administrador);
    public void recuperarContraseña(Cliente cliente, Administrador administrador);
    public void cerrarCesion();

}

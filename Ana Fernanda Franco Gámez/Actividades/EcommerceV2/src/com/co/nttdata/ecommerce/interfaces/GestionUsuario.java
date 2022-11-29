package com.co.nttdata.ecommerce.interfaces;

import com.co.nttdata.ecommerce.entidades.Cliente;
import com.co.nttdata.ecommerce.entidades.MetodoPago;
import com.co.nttdata.ecommerce.entidades.TipoDocumento;
import com.co.nttdata.ecommerce.entidades.Usuario;

public interface GestionUsuario {

    public Usuario crearUsuario(int id, String nombre, String contrasenia, TipoDocumento tipoIdentificacion, String numeroIdentificacion,
                                String correo, String telefono, String direccion, String ciudad, boolean estado, MetodoPago metodoPago);

    public void consultarUsuario();

    public Usuario loguinUsuario(Usuario us1, String usu, String con);

    public Usuario cambiarContraseña(Usuario us1, String usu);
}

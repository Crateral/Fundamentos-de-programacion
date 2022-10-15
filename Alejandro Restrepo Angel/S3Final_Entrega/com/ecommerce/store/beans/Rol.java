package com.ecommerce.store.beans;

public enum Rol {
    ADMIN("Administrador"),
    USER("Usuario");

    private String rol;

    Rol(String rol) {
        this.rol = rol;
    }

    public String getEstado() {
        return rol;
    }

    public void setEstado(String estado) {
        this.rol = rol;
    }
}

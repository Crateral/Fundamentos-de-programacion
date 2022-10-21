package com.ecommerce.store.beans;

public enum Estado {
    ACTIVO("Habilitado"),
    INACTIVO("Inhabilitado");

    private String estado;
    Estado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

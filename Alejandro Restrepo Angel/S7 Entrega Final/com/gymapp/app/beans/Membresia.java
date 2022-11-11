package com.gymapp.app.beans;

public enum Membresia {

    BASICO("Basico"),
    PREMIUM("Premium");

    private String membresia;

    Membresia(String membresia) {
        this.membresia = membresia;
    }

    public String getMembresia() {
        return this.membresia;
    }

    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }
}

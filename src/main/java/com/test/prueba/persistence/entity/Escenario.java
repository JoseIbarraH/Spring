package com.test.prueba.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Escenario {
    @Id
    private Long ID;
    private String Nombre;
    private String Direccion;
    private Double CoordenadaX;
    private Double CoordenadaY;
    private Boolean Estado;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public Double getCoordenadaX() {
        return CoordenadaX;
    }

    public void setCoordenadaX(Double coordenadaX) {
        CoordenadaX = coordenadaX;
    }

    public Double getCoordenadaY() {
        return CoordenadaY;
    }

    public void setCoordenadaY(Double coordenadaY) {
        CoordenadaY = coordenadaY;
    }

    public Boolean getEstado() {
        return Estado;
    }

    public void setEstado(Boolean estado) {
        Estado = estado;
    }
}

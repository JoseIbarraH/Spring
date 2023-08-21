package com.test.prueba.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class Periodo {
    @Id
    private Long ID;
    private int año;
    private Boolean Actual;
    private String Denominacion;
    private Date FechaInicial;
    private Date FechaFinal;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Boolean getActual() {
        return Actual;
    }

    public void setActual(Boolean actual) {
        Actual = actual;
    }

    public String getDenominacion() {
        return Denominacion;
    }

    public void setDenominacion(String denominacion) {
        Denominacion = denominacion;
    }

    public Date getFechaInicial() {
        return FechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        FechaInicial = fechaInicial;
    }

    public Date getFechaFinal() {
        return FechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        FechaFinal = fechaFinal;
    }
}

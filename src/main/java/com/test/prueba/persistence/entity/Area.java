package com.test.prueba.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class Area {
    @Id
    private Long ID;
    private Boolean Asistio;
    private Date Fecha;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Boolean getAsistio() {
        return Asistio;
    }

    public void setAsistio(Boolean asistio) {
        Asistio = asistio;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }
}

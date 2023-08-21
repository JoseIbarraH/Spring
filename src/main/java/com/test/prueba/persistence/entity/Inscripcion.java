package com.test.prueba.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Date;
@Entity
public class Inscripcion {
    @Id
    private Long ID;
    private String TipoVinculacion;
    private Date FechaInscripcion;
    @ManyToOne
    private Usuario usuario;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getTipoVinculacion() {
        return TipoVinculacion;
    }

    public void setTipoVinculacion(String tipoVinculacion) {
        TipoVinculacion = tipoVinculacion;
    }

    public Date getFechaInscripcion() {
        return FechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        FechaInscripcion = fechaInscripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

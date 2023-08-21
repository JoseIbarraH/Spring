package com.test.prueba.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Date;
@Entity
public class Actividad {
    @Id
    private Long ID;
    private String Titulo;
    private Date Dia;
    private Boolean Estado;
    private Date HoraInicial;
    private Date HoraFinal;
    private Date FechaCreacion;
    private Date FechaPublicacion;
    private Date FechaInicioInscripcion;
    private Date FechaFinalInscripcion;
    @ManyToOne
    private Escenario escenario;
    @ManyToOne
    private TipoActividad tipoActividad;
    @ManyToOne
    private Periodo periodo;
    @ManyToOne
    private Coordinador coordinador;
    @ManyToOne
    private Instructor instructor;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public Date getDia() {
        return Dia;
    }

    public void setDia(Date dia) {
        Dia = dia;
    }

    public Boolean getEstado() {
        return Estado;
    }

    public void setEstado(Boolean estado) {
        Estado = estado;
    }

    public Date getHoraInicial() {
        return HoraInicial;
    }

    public void setHoraInicial(Date horaInicial) {
        HoraInicial = horaInicial;
    }

    public Date getHoraFinal() {
        return HoraFinal;
    }

    public void setHoraFinal(Date horaFinal) {
        HoraFinal = horaFinal;
    }

    public Date getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        FechaCreacion = fechaCreacion;
    }

    public Date getFechaPublicacion() {
        return FechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        FechaPublicacion = fechaPublicacion;
    }

    public Date getFechaInicioInscripcion() {
        return FechaInicioInscripcion;
    }

    public void setFechaInicioInscripcion(Date fechaInicioInscripcion) {
        FechaInicioInscripcion = fechaInicioInscripcion;
    }

    public Date getFechaFinalInscripcion() {
        return FechaFinalInscripcion;
    }

    public void setFechaFinalInscripcion(Date fechaFinalInscripcion) {
        FechaFinalInscripcion = fechaFinalInscripcion;
    }

    public Escenario getEscenario() {
        return escenario;
    }

    public void setEscenario(Escenario escenario) {
        this.escenario = escenario;
    }

    public TipoActividad getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(TipoActividad tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public Coordinador getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}

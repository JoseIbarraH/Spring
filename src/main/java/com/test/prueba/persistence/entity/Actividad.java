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
}

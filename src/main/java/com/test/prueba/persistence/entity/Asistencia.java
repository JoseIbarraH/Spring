package com.test.prueba.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Date;
@Entity
public class Asistencia {
    @Id
    private Long Id;
    private Boolean Asistio;
    private Date Fecha;
    @ManyToOne
    private Inscripcion inscripcion;
}

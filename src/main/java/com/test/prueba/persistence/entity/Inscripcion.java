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
}

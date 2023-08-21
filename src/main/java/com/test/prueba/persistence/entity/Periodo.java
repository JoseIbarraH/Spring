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
}

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
}

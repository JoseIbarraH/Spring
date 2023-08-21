package com.test.prueba.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TipoActividad {
    @Id
    private Long ID;
    private String Titulo;
    private String Objetivo;
    private String Descripcion;
}

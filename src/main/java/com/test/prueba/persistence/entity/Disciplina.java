package com.test.prueba.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Disciplina {
    @Id
    private Long ID;
    private String Nombre;
    private String Descripcion;
    private Boolean Estado;
}

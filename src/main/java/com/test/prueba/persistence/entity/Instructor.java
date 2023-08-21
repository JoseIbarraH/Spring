package com.test.prueba.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Instructor {
    @Id
    private Long ID;
    private String Especialidad;
}

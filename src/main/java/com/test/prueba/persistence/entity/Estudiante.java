package com.test.prueba.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Estudiante {
    @Id
    private Long ID;
}

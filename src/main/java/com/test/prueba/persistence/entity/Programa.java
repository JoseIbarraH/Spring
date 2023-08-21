package com.test.prueba.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Programa {
    @Id
    private Long ID;
    private int Codigo;
    private String Nombre;
}

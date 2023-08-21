package com.test.prueba.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Escenario {
    @Id
    private Long ID;
    private String Nombre;
    private String Direccion;
    private Double CoordenadaX;
    private Double CoordenadaY;
    private Boolean Estado;
}

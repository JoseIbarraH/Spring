package com.test.prueba.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Coordinador {
    @Id
    private Long ID;
    @ManyToOne
    private Area area;
}

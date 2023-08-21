package com.test.prueba.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
@Entity
public class Usuario {
    @Id
    private Long id;
    private String Nombre;
    private String Apellido;
    private Date FechaNacimiento;
    private char Genero;

}

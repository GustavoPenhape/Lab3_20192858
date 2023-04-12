package com.laboratorio.lab3_20192858.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "doctor")
public class Doctores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "especialidad")
    private String especialidad;
    @Column(name = "hospital_id")
    private String hospital_id;
}
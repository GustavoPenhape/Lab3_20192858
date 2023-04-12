package com.laboratorio.lab3_20192858.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "paciente")
public class Pacientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "edad")
    private String edad;
    @Column(name = "genero")
    private String genero;
    @Column(name = "diagnostico")
    private String diagnostico;
    @Column(name = "fecha_cita")
    private String fecha_cita;
    @Column(name = "numero_habitacion")
    private String numero_habitacion;
    @Column(name = "doctor_id")
    private String doctor_id;
    @Column(name = "hospital_id")
    private String hospital_id;


}
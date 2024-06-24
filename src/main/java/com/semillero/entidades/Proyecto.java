package com.semillero.entidades;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "proyecto")
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private String objetivoGeneral;

    @ManyToOne
    @JoinColumn(name = "linea_id")
    private Linea linea;

    @ManyToOne
    @JoinColumn(name = "responsable_id")
    private Integrante responsable;

    private Date fechaInicio;
    private Date fechaFin;

}


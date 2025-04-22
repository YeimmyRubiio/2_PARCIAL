package com.example.API.Rest.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity

public class Entrenador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id_entrenador;
    // private int id_equipo;
    private String nombre;
    private String especialidad;

    @ManyToOne
    @JoinColumn(name = "id_equipo")
    private Equipo equipo;

}

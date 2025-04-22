package com.example.API.Rest.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity

public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id_jugador;
    //private int id_equipo;
    private String nombre;
    private String posicion;
    private int dorsal;
    private LocalDate fechaNacimiento;
    private String nacionalidad;

    @ManyToOne
    @JoinColumn(name = "id_equipo")
    private Equipo equipo;

    @OneToMany(mappedBy = "jugador")
    private List<Estadisticas_Jugador> estadisticas;

}

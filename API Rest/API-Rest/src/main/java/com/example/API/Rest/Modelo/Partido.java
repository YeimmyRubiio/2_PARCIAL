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

public class Partido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id_partido;
    private LocalDate fecha;
    private String estadio;
    //private int equipo_visita;
    //private int equipo_local;
    private int goles_local;
    private int goles_visita;

    @ManyToOne
    @JoinColumn(name = "equipo_local")
    private Equipo equipo_local;

    @ManyToOne
    @JoinColumn(name = "equipo_visitante")
    private Equipo equipo_visitante;

    @OneToMany(mappedBy = "partido")
    private List<Estadisticas_Jugador> estadisticas_jugador;
}

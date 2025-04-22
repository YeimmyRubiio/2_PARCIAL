package com.example.API.Rest.Modelo;

import jakarta.persistence.*;
import jakarta.servlet.http.Part;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity

public class Estadisticas_Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id_estadistica;
    //private int id_jugador;
    //private int id_partido;
    private int minutos_jugados;
    private int goles;
    private int asistencias;
    private int tarjetas_amarillas;
    private int tarjetas_rojas;

    @ManyToOne
    @JoinColumn(name = "id_jugador")
    private Jugador jugador;

    @ManyToOne
    @JoinColumn(name = "id_partido")
    private Partido partido;
}

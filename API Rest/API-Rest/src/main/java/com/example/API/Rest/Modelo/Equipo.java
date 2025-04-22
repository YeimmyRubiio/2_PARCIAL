package com.example.API.Rest.Modelo;

import jakarta.persistence.*;
import jakarta.servlet.http.Part;
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

public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id_equipo;
    private String nombre;
    private String ciudad;
    private LocalDate fundacion;

    @OneToMany(mappedBy = "equipo")
    private List<Jugador> jugador;

    @OneToMany(mappedBy = "equipo")
    private List<Entrenador> entrenador;

    @OneToMany(mappedBy = "equipo_local")
    private List<Partido> partido_local;

    @OneToMany(mappedBy = "equipo_visitante")
    private List<Partido> partido_visitante;

}

package com.example.API.Rest.Repository;

import com.example.API.Rest.Modelo.Equipo;
import com.example.API.Rest.Modelo.Estadisticas_Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface Estadisticas_JugadorRepository extends JpaRepository<Estadisticas_Jugador, Long> {
}

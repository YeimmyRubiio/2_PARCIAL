package com.example.API.Rest.Repository;

import com.example.API.Rest.Modelo.Estadisticas_Jugador;
import com.example.API.Rest.Modelo.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface JugadorRepository extends JpaRepository<Jugador, Long> {

}

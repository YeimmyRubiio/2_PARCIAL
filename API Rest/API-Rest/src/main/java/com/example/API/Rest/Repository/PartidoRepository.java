package com.example.API.Rest.Repository;

import com.example.API.Rest.Modelo.Jugador;
import com.example.API.Rest.Modelo.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PartidoRepository extends JpaRepository<Partido, Long> {

}

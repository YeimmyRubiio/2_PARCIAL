package com.example.API.Rest.Repository;

import com.example.API.Rest.Modelo.Entrenador;
import com.example.API.Rest.Modelo.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EquipoRepository extends JpaRepository<Equipo, Long> {
}

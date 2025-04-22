package com.example.API.Rest.Repository;

import com.example.API.Rest.Modelo.Entrenador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EntrenadorRepository extends JpaRepository<Entrenador, Long> {

}

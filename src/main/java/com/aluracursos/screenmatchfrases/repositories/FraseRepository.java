package com.aluracursos.screenmatchfrases.repositories;

import com.aluracursos.screenmatchfrases.dto.FraseDTO;
import com.aluracursos.screenmatchfrases.models.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long> {
    //Consulta JPQL
    @Query("SELECT f FROM Frase f ORDER BY function('RANDOM') LIMIT 1")
    public Frase obtenerFraseAleatoria();
}

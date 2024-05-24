package com.aluracursos.screenmatchfrases.services;

import com.aluracursos.screenmatchfrases.dto.FraseDTO;
import com.aluracursos.screenmatchfrases.models.Frase;
import com.aluracursos.screenmatchfrases.repositories.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obtenerFraseAleatoria() {
        //variable que va a recibir los resultados de la busqueda del repositorio
        Frase frase = repositorio.obtenerFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonaje(), frase.getPoster());
    }
}

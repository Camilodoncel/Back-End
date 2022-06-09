package com.example.entrenador.service.impl;

import com.example.entrenador.model.Entrenador;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EntrenadorServiceImpl implements EntrenadorService{

    @Override
    public List<Entrenador> listaEntrenadores() {
        return Arrays.asList(
                new Entrenador("Juan"),
                new Entrenador("Bilardo"),
                new Entrenador("Pep"),
                new Entrenador("Mou"));
    }
}

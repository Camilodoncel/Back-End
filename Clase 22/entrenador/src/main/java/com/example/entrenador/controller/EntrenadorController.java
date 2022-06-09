package com.example.entrenador.controller;

import com.example.entrenador.model.Entrenador;
import com.example.entrenador.service.impl.EntrenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping /*redirecciona luego de la barra en el link, son los end points de las URL*/
public class EntrenadorController {
    @Autowired /*Delega la construccion del objeto a Spring boot*/
    private final EntrenadorService entrenadorService;

    public EntrenadorController(EntrenadorService entrenadorService) {
        this.entrenadorService = entrenadorService;
    }

    @GetMapping
    public List<Entrenador> getEntrenador(){
        return entrenadorService.listaEntrenadores();
    }
}

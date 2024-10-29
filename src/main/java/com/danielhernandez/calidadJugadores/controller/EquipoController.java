package com.danielhernandez.calidadJugadores.controller;

import com.danielhernandez.calidadJugadores.dto.EquipoJugadorDTO;
import com.danielhernandez.calidadJugadores.entiities.Equipo;
import com.danielhernandez.calidadJugadores.entiities.Jugador;
import com.danielhernandez.calidadJugadores.repository.EquipoRepository;
import com.danielhernandez.calidadJugadores.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/equipos")
public class EquipoController {
    @Autowired
    private EquipoRepository equipoRepository;


    @Autowired
    private JugadorRepository jugadorRepository;

    @GetMapping()
    public List<Equipo> selectEquipo() {
        List<Equipo> equipos = equipoRepository.findAll();

        return equipos;
    }

    @GetMapping("/{equipoCod}")
    public EquipoJugadorDTO getEquipo (@PathVariable("equipoCod")Integer equipoCod){
        Equipo infoEquipo = equipoRepository.findEquipoByEquipoCod(equipoCod);
        List<Jugador> jugadores = jugadorRepository.findAllByEquipoCod(equipoCod);
        return new EquipoJugadorDTO(infoEquipo, jugadores);
    }



}



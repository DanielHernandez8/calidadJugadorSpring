package com.danielhernandez.calidadJugadores.dto;

import com.danielhernandez.calidadJugadores.entiities.Equipo;
import com.danielhernandez.calidadJugadores.entiities.Jugador;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EquipoJugadorDTO {
    List<Jugador> jugadores;
    Equipo equipo;

    public EquipoJugadorDTO(Equipo infoEquipo, List<Jugador> jugadores) {
        this.equipo=infoEquipo;
        this.jugadores=jugadores;
    }

}


package com.danielhernandez.calidadJugadores.repository;

import com.danielhernandez.calidadJugadores.entiities.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador,Integer> {
    List<Jugador> findAllByEquipoCod(Integer equipoCod);
}

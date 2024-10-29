package com.danielhernandez.calidadJugadores.repository;

import com.danielhernandez.calidadJugadores.entiities.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipoRepository extends JpaRepository<Equipo,Integer> {
    Equipo findEquipoByEquipoCod(Integer equipoCod);
}

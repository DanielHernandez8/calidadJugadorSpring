package com.danielhernandez.calidadJugadores.entiities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "equipo")
public class Equipo {
	@Id
	private int equipoCod;
	private String nombre;
	private String fundacion;
	private String presidente;
	private int presupuesto;
	private String equipacion;
	private String fotoEquipo;
	private String fotoEscudo;
	private String paginaWeb;
}

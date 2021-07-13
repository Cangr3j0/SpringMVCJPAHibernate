package paginadinamica.servicio;


import java.util.List;

import paginadinamica.Jugador;

public interface ServicioJugadorJPA {

	Jugador saveAndFlush(Jugador jugador);
	Jugador findByNick(String nick);
	List<Jugador> findAll();
	Jugador findByElo(String elo);
}

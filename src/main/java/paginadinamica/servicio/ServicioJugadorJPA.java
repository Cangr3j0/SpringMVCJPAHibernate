package paginadinamica.servicio;


import paginadinamica.Jugador;

public interface ServicioJugadorJPA {

	Jugador saveAndFlush(Jugador jugador);
}

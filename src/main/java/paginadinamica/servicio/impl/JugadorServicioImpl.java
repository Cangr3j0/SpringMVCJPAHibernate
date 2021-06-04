package paginadinamica.servicio.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import paginadinamica.Jugador;
import paginadinamica.repositorio.RepositorioJugadores;
import paginadinamica.servicio.ServicioJugador;

@Service
public class JugadorServicioImpl implements ServicioJugador{
	@Autowired
	private RepositorioJugadores repositorioJugadores;

	@Override
	public List<Jugador> obtenerJugadores() {
		// TODO Auto-generated method stub
		return repositorioJugadores.obtenerJugadores();
	}

	@Override
	public Jugador obtenerJugadorByNick(String nick) {
		return repositorioJugadores.obtenerJugadorByNick(nick);
	}

	@Override
	public List<Jugador> obtenerJugadorPorLiga(String liga) {
		return repositorioJugadores.obtenerJugadorPorLiga(liga);
	}

	@Override
	public void anadirJugador(Jugador j) {
		repositorioJugadores.anadirJugador(j);
	}

	
}

package paginadinamica.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import paginadinamica.Jugador;
import paginadinamica.repositorio.RepositorioJugadores;
import paginadinamica.servicio.RealizarServicio;


@Service
public class RealizarServicioImpl implements RealizarServicio{
	@Autowired
	private RepositorioJugadores repo;

	@Override
	public void procesarServicio(String nick, int visitas) {
		Jugador jugadorPorNick=repo.obtenerJugadorByNick(nick);
		jugadorPorNick.setVisitas(jugadorPorNick.getVisitas()+visitas);
	}


}

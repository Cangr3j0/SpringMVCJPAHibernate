package paginadinamica.repositorio;
import java.util.List;

import org.springframework.stereotype.Repository;

import paginadinamica.Jugador;


@Repository
public interface RepositorioJugadores{

	public List <Jugador> obtenerJugadores();

	public Jugador obtenerJugadorByNick(String nick);
	
	public List<Jugador> obtenerJugadorPorLiga(String liga);
	
	public void anadirJugador(Jugador j);
}


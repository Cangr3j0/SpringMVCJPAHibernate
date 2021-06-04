package paginadinamica.servicio;

import java.util.List;

import paginadinamica.Jugador;

public interface ServicioJugador{
	/*
	 * Retorna una lista de Jugadores.
	 * @return List<Jugador> lista de jugadores.
	 */
	public List <Jugador> obtenerJugadores();
	
	/*
	 * Servicio que retorna un Jugador segun el nick.
	 * @return Jugador Jugador a retornar.
	 */
	public Jugador obtenerJugadorByNick(String nick);
	
	
	/*
	 * Retorna una lista de jugadores segun la liga en la que esten.
	 * @return Lista de jugadores segun liga.
	 */
	public List<Jugador> obtenerJugadorPorLiga(String liga);
	
	public void anadirJugador(Jugador j);
}


package paginadinamica.repositorio.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import paginadinamica.Jugador;
import paginadinamica.repositorio.RepositorioJugadores;

@Repository
public class EnMemoriaRepositorioJugadores implements RepositorioJugadores {
	private List<Jugador> listaJugadores = new ArrayList<Jugador>();

	public EnMemoriaRepositorioJugadores() {
	Jugador kurolo=new Jugador("Lucho Arroyo", "Kurolo", "asd@gmail.com", "Platino IV", 0,"usernameenmemoria1","passwordenmemoria1");
	Jugador kurolo2=new Jugador("Lucho Arroyo2", "Kurolo2", "asd@gmail.com2", "Oro IV", 0,"usernameenmemoria2","passwordenmemoria2");
	Jugador kurolo3=new Jugador("Lucho Arroyo3", "Kurolo3", "asd@gmail.com3", "Platino IV", 0,"usernameenmemoria3","passwordenmemoria3");
	listaJugadores.add(kurolo);
	listaJugadores.add(kurolo2);
	listaJugadores.add(kurolo3);
	}
	
	@Override
	public List<Jugador> obtenerJugadores() {
		// TODO Auto-generated method stub
		return listaJugadores;
	}

	@Override
	public Jugador obtenerJugadorByNick(String nick) {
		Jugador jugadorToReturn=null;
		for(Jugador j:listaJugadores) {
			if(j!=null&&j.getNick()!=null&&j.getNick().equalsIgnoreCase(nick)) {
				jugadorToReturn=j;
				break;
			}
		}
		if(jugadorToReturn==null) {
			throw new IllegalArgumentException("No se encontro el jugador con el nick: "+nick);
		}
		return jugadorToReturn;
	}

	@Override
	public List<Jugador> obtenerJugadorPorLiga(String liga) {
		List<Jugador>listaPorCategoria=new ArrayList<Jugador>();
		for(Jugador j:listaJugadores) {
			if(liga.equalsIgnoreCase(j.getElo())) {
				listaPorCategoria.add(j);
			}
					
		}
		return listaPorCategoria;
	}

	@Override
	public void anadirJugador(Jugador j) {
		listaJugadores.add(j);
		
	}

	
	
	
}


package paginadinamica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import paginadinamica.servicio.ServicioJugadorJPA;

@Controller
public class Controlador {
	

	@Qualifier("ServicioJugadorJPA")
	private ServicioJugadorJPA jugadorrepositorio;
	
	@Autowired
	public Controlador(ServicioJugadorJPA jugadorrepositorio) {
		this.jugadorrepositorio=jugadorrepositorio;
	}
	@RequestMapping("/home")
	public String muestraPagina() {
		Jugador jugador=new Jugador();
		jugador.setId(1);
		jugador.setElo("platino");
		jugador.setEmail("asd@gmail.com");
		jugador.setNick("Testing1");
		jugador.setNombreReal("Test nombre real 1");
		jugador.setPosEnRanking(2);
		jugador.setTorneosGanados(2);
		jugador.setVisitas(2);
		jugadorrepositorio.saveAndFlush(jugador);
		Jugador jugador2=new Jugador();
		jugador2.setId(2);
		jugador2.setElo("Oro");
		jugador2.setEmail("email2@gmail.com");
		jugador2.setNick("NickTest");
		jugador2.setNombreReal("Test nombre Real 2");
		jugador2.setPosEnRanking(3);
		jugador2.setTorneosGanados(3);
		jugador2.setVisitas(4);
		jugadorrepositorio.saveAndFlush(jugador2);
		return "paginaejemplo";
	}
}

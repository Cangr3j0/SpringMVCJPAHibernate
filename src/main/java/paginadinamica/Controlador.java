package paginadinamica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import paginadinamica.servicio.ServicioJugadorJPA;

@Controller
public class Controlador {
	

//	@Qualifier("ServicioJugadorJPA")
//	private ServicioJugadorJPA jugadorrepositorio;
//	
//	@Autowired
//	public Controlador(ServicioJugadorJPA jugadorrepositorio) {
//		this.jugadorrepositorio=jugadorrepositorio;
//	}
//	@RequestMapping("/home")
//	public String muestraPagina() {
//		Jugador jugador=new Jugador();
//		jugador.setId(1);
//		jugador.setElo("platino");
//		jugador.setEmail("asd@gmail.com");
//		jugador.setNick("Kurolo2");
//		jugador.setNombreReal("Test nombre real 1");
//		jugador.setPosEnRanking(2);
//		jugador.setTorneosGanados(2);
//		jugador.setVisitas(2);
//		jugadorrepositorio.saveAndFlush(jugador);
//		Jugador jugador2=new Jugador();
//		jugador2.setId(2);
//		jugador2.setElo("Oro");
//		jugador2.setEmail("email2@gmail.com");
//		jugador2.setNick("NickTest");
//		jugador2.setNombreReal("Test nombre Real 2");
//		jugador2.setPosEnRanking(3);
//		jugador2.setTorneosGanados(3);
//		jugador2.setVisitas(4);
//		jugadorrepositorio.saveAndFlush(jugador2);
//		return "paginaejemplo";
//	}
//	@RequestMapping(value="/{nick}", method=RequestMethod.GET)
//	public String jugadorPorNick(@PathVariable String nick,Model model) {
//		model.addAttribute("jugador", jugadorrepositorio.findByNick(nick));
//		return "jugador";
//	}
//	@RequestMapping(value="/agregar", method=RequestMethod.GET)
//	public String getAnadirJugador(Model model) {
//		Jugador nuevoJugador=new Jugador();
//		model.addAttribute("nuevoJugador", nuevoJugador);
//		
//		return "agregarjugador";
//	}
//	@RequestMapping(value="/agregar", method=RequestMethod.POST)
//	public String postAnadirJugador(@ModelAttribute("nuevoJugador")Jugador jugador) {
//		jugadorrepositorio.saveAndFlush(jugador);
//		return "redirect:/all";
//	}
//	
//	@RequestMapping("/all")
//	public String todosLosJugadores(Model model) {
//	model.addAttribute("jugadores", jugadorrepositorio.findAll());
//	return "jugadores";
//	}
}

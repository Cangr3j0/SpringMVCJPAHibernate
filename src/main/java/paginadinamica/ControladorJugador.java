package paginadinamica;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import paginadinamica.servicio.ServicioJugador;

@Controller
@RequestMapping("/jugadores")
public class ControladorJugador {
	@Autowired
	private ServicioJugador servicioJugador;


	@RequestMapping
	public String listajugadores(Model model) {
		model.addAttribute("jugadores",servicioJugador.obtenerJugadores());
		return "jugadores";
	}
	
	@RequestMapping("/all")
	public String todosLosJugadores(Model model) {
	model.addAttribute("jugadores", servicioJugador.obtenerJugadores());
	return "jugadores";
	}
	
	@RequestMapping("/liga/{liga}")
	public String jugadoresPorLiga(Model model,@PathVariable("liga") String ligaDelJugador) {
		model.addAttribute("jugadores", servicioJugador.obtenerJugadorPorLiga(ligaDelJugador));
		return "jugadores";
	}

	@RequestMapping("/jugador")
	public String jugadorPorNick1(@RequestParam("nick")String nick,Model model) {
		model.addAttribute("jugador", servicioJugador.obtenerJugadorByNick(nick));
		return "jugador";
	}
	@RequestMapping(value="/{nick}", method=RequestMethod.GET)
	public String jugadorPorNick(@PathVariable String nick,Model model) {
		model.addAttribute("jugador", servicioJugador.obtenerJugadorByNick(nick));
		return "jugador";
	}

	@RequestMapping(value="/agregar", method=RequestMethod.GET)
	public String getAnadirJugador(Model model) {
		Jugador nuevoJugador=new Jugador();
		model.addAttribute("nuevoJugador", nuevoJugador);
		
		return "agregarjugador";
	}
	@RequestMapping(value="/agregar", method=RequestMethod.POST)
	public String postAnadirJugador(@ModelAttribute("nuevoJugador")Jugador jugador) {
	//	servicioJugador.a�adirJugador(jugador);
		servicioJugador.anadirJugador(jugador);
		return "redirect:/jugadores";
	}
}

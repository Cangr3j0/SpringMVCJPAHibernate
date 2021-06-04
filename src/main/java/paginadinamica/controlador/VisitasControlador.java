/*


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import paginadinamica.servicio.RealizarServicio;

	@Controller
	public class VisitasControlador {
	@Autowired
	private RealizarServicio realizarServicio;
	
	@RequestMapping("/visitas/Kurolo/2")
	public String procesar() {
		realizarServicio.procesarServicio("Kurolo", 2);
		return "redirect:/jugadores";
	}
	
}
*/
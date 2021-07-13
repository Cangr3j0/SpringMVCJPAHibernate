package paginadinamica.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import paginadinamica.Jugador;
import paginadinamica.repositorio.JugadorRepositorioJPA;
import paginadinamica.servicio.ServicioJugadorJPA;

@Service
@Transactional
public class JugadorServicioJPA implements ServicioJugadorJPA{

	public JugadorRepositorioJPA jugadorrepo; 
	
	@Autowired
	public JugadorServicioJPA(JugadorRepositorioJPA jugadorrepo) {
		this.jugadorrepo=jugadorrepo;
	}
	

	@Override
	public Jugador saveAndFlush(Jugador jugador) {
		return jugadorrepo.saveAndFlush(jugador);
	}


	@Override
	public Jugador findByNick(String nick) {
		return jugadorrepo.findByNick(nick);
	}


	@Override
	public List<Jugador> findAll() {
		// TODO Auto-generated method stub
		return jugadorrepo.findAll();
	}


	@Override
	public Jugador findByElo(String elo) {
		// TODO Auto-generated method stub
		return jugadorrepo.findByElo(elo);
	}
	
}
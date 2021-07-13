
package paginadinamica.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


import paginadinamica.Jugador;


public interface JugadorRepositorioJPA extends JpaRepository<Jugador, Integer>,PagingAndSortingRepository<Jugador, Integer> {

	Jugador saveAndFlush(Jugador jugador);
	Jugador findByNick(String nick);
	List<Jugador> findAll();
	Jugador findByElo(String elo);
}
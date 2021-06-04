
package paginadinamica.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import paginadinamica.Jugador;


public interface JugadorRepositorioJPA extends JpaRepository<Jugador, Integer> {

	Jugador saveAndFlush(Jugador jugador);
}
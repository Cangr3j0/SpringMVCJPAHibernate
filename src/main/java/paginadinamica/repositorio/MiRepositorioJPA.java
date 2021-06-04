/*package paginadinamica.repositorio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import paginadinamica.Jugador;

@Repository
public class MiRepositorioJPA implements MiRepositorio{

	   @PersistenceUnit
	    private EntityManagerFactory emf;
	   private EntityManager currentEntityManager(){
		   
		    return emf.createEntityManager();
	   }
	@Override
	public Jugador find(String nick) {
		return currentEntityManager().find(Jugador.class, nick);
	}

	@Override
	public String save(Jugador jugador) {
		 currentEntityManager().persist(jugador);
		return jugador.getNick().toString();
	}

}
*/
package paginadinamica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jugador")
public class Jugador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	 @Column(name = "nombreReal", nullable = false)
	private String nombreReal;
	 @Column(name = "nick", nullable = false)
	private String nick;
	 @Column(name = "email", nullable = false)
	private String email;
	 @Column(name = "elo", nullable = false)
	private String elo;
	 @Column(name = "posEnRanking", nullable = false)
	private int posEnRanking;
	 @Column(name = "visitas", nullable = false)
	private int visitas;
	 @Column(name = "torneosGanados", nullable = false)
	private int torneosGanados;
	 @Column(name = "username", nullable = false)
	private String username;
	 @Column(name = "password", nullable = false)
	private String password;
	public Jugador() {}
	public Jugador(String nombreReal, String nick, String email, String elo, int posEnRanking,String username,String password) {
		super();
		this.nombreReal = nombreReal;
		this.nick = nick;
		this.email = email;
		this.elo = elo;
		this.posEnRanking = posEnRanking;
		visitas=0;
		torneosGanados=0;
		this.username=username;
		this.password=password;
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreReal() {
		return nombreReal;
	}
	public void setNombreReal(String nombreReal) {
		this.nombreReal = nombreReal;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getElo() {
		return elo;
	}
	public void setElo(String elo) {
		this.elo = elo;
	}
	public int getPosEnRanking() {
		return posEnRanking;
	}
	public void setPosEnRanking(int posEnRanking) {
		this.posEnRanking = posEnRanking;
	}
	public int getVisitas() {
		return visitas;
	}
	public void setVisitas(int visitas) {
		this.visitas = visitas;
	}
	public int getTorneosGanados() {
		return torneosGanados;
	}
	public void setTorneosGanados(int torneosGanados) {
		this.torneosGanados = torneosGanados;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}

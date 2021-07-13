package paginadinamica;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@Configuration
@EnableWebMvcSecurity
public class SeguridadConfig extends WebSecurityConfigurerAdapter{
	
	
	
	
	//Este metodo especifica como las request HTTPs deben ser aseguradas
	//y que opciones tiene un cliente para autenticar el usuario.
	//La llamada a .authorizeRequests().anyRequest().authenticated() especifica
	//que todas las llamadas HTTPs que se envian a la aplicacion sean autentificadas.
	//Ademas configura (a traves del metodo formLogin()) que soporte la autentificacion
	//a traves de un formulario de login predefinido 
	//Mientras tanto si no sobreescribimos el metodo 
	//configure(Authentication-ManagerBuilder) 
	//(otro metodo de WebSecurityConfigureAdapter)
	//no hay usuarios para poder autentificarse. (Lo haremos mas abajo)
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
			.antMatchers("jugadores/agregar").hasAuthority("ADMIN")
				.anyRequest().authenticated()
					.and().
						formLogin().
						and().
						httpBasic();
		}
	
	//Este otro metodo especifica algunos detalles de seguridad al hacer un Http request
	//El primer llamado a "antMatchers" especifica que la request que se haga
	//a esa direccion debe ser autentificada. El segundo llamado a antMatchers
	//es mas especifico, diciendo que cualquier request de tipo POST debe ser autentificada
	//Finalmente la llamada a "anyRequest" dice que todas las demas request deben ser
	//permitidas sin autentificacion o autoridad
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//		.authorizeRequests()
//		.antMatchers("/spitters/me").authenticated()
//		.antMatchers(HttpMethod.POST, "/spittles").authenticated()
//		.anyRequest().permitAll();}
	
	
	
	@Autowired
	DataSource dataSource;
	@Override
	protected void configure(AuthenticationManagerBuilder auth)throws Exception {
		auth.
		jdbcAuthentication().
		dataSource(dataSource).usersByUsernameQuery("select username,CONCAT('{noop}',password),true from jugador where username=?")
		.authoritiesByUsernameQuery("select username,authority from jugador where username = ?");
		
	}
	

	
	//Este metodo controla la autentificacion de los usuarios/los usuarios y sus roles.
	//La etiqueta {noop} especifica que no se utilice ninguna decodificacion de password
	//si no la utilizamos al intentar loguear con estos usuarios nos lanzara un error
	//que necesitamos un passwordencoder diferente de null.
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth)throws Exception {
//		auth.
//		inMemoryAuthentication().
//		withUser("user").password("{noop}password").roles("USER")
//		.and()
//		.withUser("admin").password("{noop}password").roles("USER", "ADMIN");
//		}
//	
	
}



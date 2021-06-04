package paginadinamica;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


/*
 * Configura el DispatcherServlet (Anteriormente se hacia mediante web.xml)
 * 
 */
public class PaginaWebInicializador extends AbstractAnnotationConfigDispatcherServletInitializer{


	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] { RootConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] { WebConfig.class };
	}


}

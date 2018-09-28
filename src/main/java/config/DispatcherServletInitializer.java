package config;

import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*
 * This class provides the config for the front controller - the Dispatcher Servlet
 * There are two IoC containers in a Spring web app:
 * 1. The first maintains the web beans: HandlerMapping, Controller, ViewResolver
 * 2. The second maintains the app beans e.g.: DataSource, SessionFactory, DAO, Service
 * getRootConfigClasses returns an array of classes that provide the config for the web IoC container
 * getServletConfigClasses returns an array of classes that provide the config for the app IoC container
 * getServletMappings returns an array of URLs that the front controller will handle
 */
public class DispatcherServletInitializer 
	extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { AppContextConfig.class, SecurityConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebContextConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}





}

package com.nt.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInitialization extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		System.out.println("ApplicationInitialization.getRootConfigClasses()");
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		System.out.println("ApplicationInitialization.getServletConfigClasses()");
		
		return new Class[] { MyConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		
		System.out.println("ApplicationInitialization.getServletMappings()");
		
		return new String[] {"/"} ;
	}

}

package com.nt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.nt.controller","com.nt.config"})
@EnableWebMvc
public class MyConfig implements WebMvcConfigurer {
	
	@Autowired
	private PhoneNumberFormater phoneFormater;
	
	@Bean
	public ViewResolver setViewResolver() {
		return new InternalResourceViewResolver("/view/", ".jsp");
	}
	
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasename("application");
		return source;
	}
	
	 @Override
	    public void addFormatters(FormatterRegistry registry) {
	        registry.addFormatter(phoneFormater);
	    }

}

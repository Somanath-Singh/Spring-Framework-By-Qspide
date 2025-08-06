package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ioc.Test;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan("com.ioc")
public class MyConfig
{
	
	@Bean
	public Test getTest()
	{
		return new Test();
	}
	
	@Bean
	public String getString()
	{
		return "Somanath Singh";
	}
    
}

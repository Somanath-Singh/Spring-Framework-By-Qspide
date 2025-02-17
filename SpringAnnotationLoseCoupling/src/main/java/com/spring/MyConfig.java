package com.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan({"com.IOCImplementation","com.looseCoupling"})
@PropertySource({"classpath:application.properties"})
public class MyConfig
{
	
    
}

package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


@Configuration
@ComponentScan("com.ioc")
@PropertySource({"application.properties","Properties/message.properties"})
public class MyConfig
{
	
	@Autowired
	Environment enviroment; 
	
	
	public void getEnviromentDbDetails()
	{
		System.out.println(enviroment.getProperty("db1.url"));
		System.out.println(enviroment.getProperty("db1.userName"));
		System.out.println(enviroment.getProperty("db1.password"));
		
		System.out.println(enviroment.getProperty("db2.url"));
		System.out.println(enviroment.getProperty("db2.userName"));
		System.out.println(enviroment.getProperty("db2.password"));
		
		System.out.println(enviroment.getProperty("db3.url"));
		System.out.println(enviroment.getProperty("db3.userName"));
		System.out.println(enviroment.getProperty("db3.password"));
		
		System.out.println(enviroment.getProperty("db.msg"));
	}
    
}

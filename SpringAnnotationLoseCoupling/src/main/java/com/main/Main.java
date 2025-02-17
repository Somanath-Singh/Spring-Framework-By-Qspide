package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.looseCoupling.Driver;
import com.spring.MyConfig;

public class Main {

	public static void main(String[] args) {
		
		//create the object of IOC container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Driver driver = (Driver) context.getBean(Driver.class);
		
		driver.startTheCar();
		
		driver.stopTheCar();
		
		

	}

}

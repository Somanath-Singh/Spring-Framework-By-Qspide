package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ioc.Test;
import com.spring.MyConfig;

public class Main {

	public static void main(String[] args) {
		
		//create the object of IOC container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		//get the object of Test class
		//Test test1 = context.getBean(Test.class);
		
		Test test1 = (Test)context.getBean("test");
		
		test1.setId(1);
		test1.setName("Somanath Singh");
		
		System.out.println(test1);
		
		//created the object using bean
		String name = (String)context.getBean("getString");
		
		System.out.println(name);
		
		

	}

}

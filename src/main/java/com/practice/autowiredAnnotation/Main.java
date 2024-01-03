package com.practice.autowiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("autowiredAnnotation.xml");

		Car obj = context.getBean(Car.class);
		obj.drive();
		

		 
	}

	
	
}

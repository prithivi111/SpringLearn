package com.practice.xmlBasedSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("xmlBasedSpring.xml");

		Vehicle obj = (Vehicle) context.getBean("car");
		obj.drive(); 
		obj.display();
			
		 
	}

	
	
}

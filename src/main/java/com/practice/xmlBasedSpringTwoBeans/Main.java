package com.practice.xmlBasedSpringTwoBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("xmlBasedSpringTwoBeans.xml");
		Part obj1 = (Part)context.getBean("part");
		obj1.functioning();
		
		Vehicle obj = (Vehicle) context.getBean("Bike");
		obj.drive(); 
		obj.display();
		
		
			
		 
	}
 
	
	
}

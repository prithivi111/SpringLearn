package javaFileConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		//Samsung s7= applicationContext.getBean(Samsung.class);   or we can write as below:
		Samsung s7= applicationContext.getBean(Samsung.class);

		s7.setColor("Black");
	
		s7.config();
		
	}

}

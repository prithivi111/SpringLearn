package javaFileConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="javaFileConfiguration")
public class ConfigurationClass {
	
//	@Bean (name = "samsung")
//	@Scope (value ="singleton")
//	public Samsung getPhone() {
//		return new Samsung();
//	}
//
//	
//	@Bean (name= "mobileprocessor")
//	public MobileProcessor getProcessor() {		
//		MobileProcessor mm = new Snapdragon();
//		return mm;		
//	}
}

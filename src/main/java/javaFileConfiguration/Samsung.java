package javaFileConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	@Autowired
	@Qualifier("mediatek")
	MobileProcessor cpu;	
//	public MobileProcessor getCpu() {
//		return cpu;
//	}
//	public void setCpu(MobileProcessor cpu) {
//		this.cpu = cpu;
//	}

	String color;	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void config() {
		System.out.println("Inside Config Method");
		System.out.println(getColor());
		cpu.process();
	}

}

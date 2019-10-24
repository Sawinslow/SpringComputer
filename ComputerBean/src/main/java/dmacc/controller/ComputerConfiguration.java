package dmacc.controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.computer.Memory;
import dmacc.computer.computers;
@Configuration
public class ComputerConfiguration {
	@Bean
	public computers computer() {
		computers bean = new computers("Something" );
//		bean.setBrand("CoolMaster");
//		bean.setType("MiniTower");
//		bean.setCpuType("AMD");
		bean.setMemory(memory());
		return bean;
	}
	@Bean
	public Memory memory() {
		Memory bean = new Memory ("Razor", 12,15);
		return bean;
	}

}

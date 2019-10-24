package dmacc.controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.computer.Memory;
import dmacc.computer.computer;
@Configuration
public class ComputerConfiguration {
	@Bean
	public computer computer() {
		computer bean = new computer("Something" );

		bean.setMemory(memory());
		return bean;
	}
	@Bean
	public Memory memory() {
		Memory bean = new Memory ("Razor", 12,15);
		return bean;
	}

}

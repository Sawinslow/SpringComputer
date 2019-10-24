package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.computer.Memory;
import dmacc.computer.computer;
import dmacc.controller.ComputerConfiguration;
import dmacc.repository.ComputerRepository;

@SpringBootApplication
public class ComputerBeanApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ComputerBeanApplication.class, args);
	}

	
	@Autowired
	ComputerRepository repo;

	public void run(String... args) throws Exception {
		
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(ComputerConfiguration.class);

		computer c = appContext.getBean("computer", computer.class);
		c.setCpuType("Intel");
		repo.save(c);

		
		computer d = new computer("be quiet", "Full Tower", "Intel");
		Memory a = new Memory("Razor", 18, 210);
		d.setMemory(a);
		repo.save(d);

		List<computer> allMycomputers = repo.findAll();
		for (computer com : allMycomputers) {
			System.out.println(com.toString());
		}
		
	}

}

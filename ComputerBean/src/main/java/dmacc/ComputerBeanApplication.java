package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.computer.Memory;
import dmacc.computer.computers;
import dmacc.controller.ComputerConfiguration;
import dmacc.repository.ComputerRepository;

@SpringBootApplication
public class ComputerBeanApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComputerBeanApplication.class, args);
//
//
//		computers c = appContext.getBean("computer", computers.class);
//
//		System.out.println(c.toString());

	}

	@Autowired
	ComputerRepository repo;

	public void run(String... args) throws Exception {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(ComputerConfiguration.class);

		computers c = appContext.getBean("computer", computers.class);
		c.setCpuType("Intel");
		repo.save(c);

		
		computers d = new computers("be quiet", "Full Tower", "Intel");
		Memory a = new Memory("Razor", 18, 210);
		d.setMemory(a);
		repo.save(d);

		List<computers> allMycomputerss = repo.findAll();
		for (computers com : allMycomputerss) {
			System.out.println(com.toString());
		}
		
	}

}

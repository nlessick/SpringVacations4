package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Locations;
import dmacc.beans.PlaneInfo;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.VacationsRepository;

@SpringBootApplication
public class SpringVacationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringVacationsApplication.class, args);
		
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Locations l = appContext.getBean("locations", Locations.class);
				
		//System.out.println(l.toString());
	}
	
//	@Autowired
//	VacationsRepository repo;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//		
//		//Using an existing bean
//		Locations l = appContext.getBean("locations", Locations.class);
//		l.setNumPeople(7);
//		repo.save(l);
//		
//		//Creating a bean to use - not managed by Spring
//		Locations d = new Locations("Florida", 4, 4);
//		PlaneInfo p = new PlaneInfo("American Airlines", 555, 1);
//		d.setPlaneInfo(p);
//		repo.save(d);
//		
//		List<Locations> allLocations = repo.findAll();
//		for(Locations trip: allLocations) {
//			System.out.println(trip.toString());
//		}
//		
//		((AbstractApplicationContext) appContext).close();
//	}

}

package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Locations;
import dmacc.beans.PlaneInfo;

/**
 * @author {Nathaniel Essick} - nlessick
 * CIS175 - Spring 2021
 * {3/17/2021}
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	public Locations locations() {
		Locations bean = new Locations("Disney World");
		//bean.setCity("Paris");
		//bean.setNumDays(10);
		//bean.setNumPeople(5);
		return bean;
	}
	
	@Bean
	public PlaneInfo planeInfo() {
		PlaneInfo bean = new PlaneInfo("American Airlines", 123, 3);
		return bean;
	}

}

package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Locations;
import dmacc.repository.VacationsRepository;

/**
 * @author {Nathaniel Essick} - nlessick
 * CIS175 - Spring 2021
 * {3/29/2021}
 */
@Controller
public class WebController {
	@Autowired
	VacationsRepository repo;
	
	@GetMapping({"/", "viewAll"})
	public String viewAllVacations(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewVacation(model);
		}
	
		model.addAttribute("vacations", repo.findAll());
		
		return "results";
	}
	
	@GetMapping("/inputVacation")
	public String addNewVacation(Model model) {
		Locations l = new Locations();
		model.addAttribute("newVacation", l);
		return "input";
	}
	
	@PostMapping("/inputVacation")
	public String addNewVacation(@ModelAttribute Locations l, Model model) {
		repo.save(l);
		return viewAllVacations(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateVacation(@PathVariable("id") long id, Model model) {
		Locations l = repo.findById(id).orElse(null);
		model.addAttribute("newVacation", l);
		return "input";
	}
	
	@PostMapping("/update/{id}")
	public String reviseVacation(Locations l, Model model) {
		repo.save(l);
		return viewAllVacations(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Locations l = repo.findById(id).orElse(null);
		repo.delete(l);
		return viewAllVacations(model);
	}

}

package epi.PFA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import epi.PFA.entities.Encadrant;
import epi.PFA.entities.Etudiant;
import epi.PFA.sevice.EncadrantService;
import epi.PFA.sevice.EtudiantService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/encadrants/")
public class RestEncadrantController {
	
	
	@Autowired
	EncadrantService encadrantService;
	
    @GetMapping("all")
	public List<Encadrant> all(){ 
		return encadrantService.getAllEncadrants();

	}

	@GetMapping ("{id}")
	public Encadrant getEncadrant (@PathVariable Long id) {

	return encadrantService.findEncadrantById(id);

	}

	@PostMapping("add")
	public Encadrant addChaine (@RequestBody Encadrant e) { 
		return encadrantService.persistEncadrant(e);

	}

	@DeleteMapping("{id}")

	public  String deleteEncadrant(@PathVariable Long id) { 
			encadrantService.deleteEncadrant(id); 
			return "Suppression réussite";

	}
	@GetMapping("edit/{id}")
	public String editEncadrant(@PathVariable Long id, Model model) {
		model.addAttribute("Encadrant", encadrantService.findEncadrantById(id));
		
		return "editEncadrant";
	}
	
	@PutMapping("update")
	public Encadrant updateEncadrant(@RequestBody  Encadrant en)
	{
		 return encadrantService.persistEncadrant(en);
		
	}

}

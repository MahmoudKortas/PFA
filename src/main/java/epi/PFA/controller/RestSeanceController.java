package epi.PFA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import epi.PFA.entities.Salle;
import epi.PFA.entities.Seance;
import epi.PFA.sevice.EtudiantService;
import epi.PFA.sevice.SalleService;
import epi.PFA.sevice.SeanceService;



@CrossOrigin("*")
@RestController
@RequestMapping("/api/seance/")
public class RestSeanceController {
	
	
	@Autowired
	SeanceService seanceService;
@GetMapping("all")
	public List<Seance> all (){ 
		return seanceService.getAllSeance();

	}

	@GetMapping ("{id}")
	public Seance getSeance (@PathVariable Long id) {

	return seanceService.findSeanceById(id);

	}

	@PostMapping("add")
	public Seance addSeance (@RequestBody Seance se) { 
		return seanceService.persistSeance(se);

	}

	@DeleteMapping("{id}")
	public  String deleteSeance (@PathVariable Long id) { 
		seanceService.deleteSeance(id); 
		return "Suppression réussite";

	}
	@PutMapping("update")
	public Seance updateSeance(@RequestBody  Seance se)
	{
		 return seanceService.persistSeance(se);
		
	}
	

}

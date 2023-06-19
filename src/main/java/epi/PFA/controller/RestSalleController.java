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
import epi.PFA.sevice.EtudiantService;
import epi.PFA.sevice.SalleService;



@CrossOrigin("*")
@RestController
@RequestMapping("/api/salles/")
public class RestSalleController {
	
	
	@Autowired
	SalleService salleService;
@GetMapping("all")
	public List<Salle> all (){ 
		return salleService.getAllSalles();

	}

	@GetMapping ("{id}")
	public Salle getSalle (@PathVariable Long id) {

	return salleService.findSalleById(id);

	}

	@PostMapping("add")
	public Salle addSalle (@RequestBody Salle s) { 
		return salleService.persistSalle(s);

	}

	@DeleteMapping("{id}")
	public  String deleteSalle (@PathVariable Long id) { 
		salleService.deleteSalle(id); 
		return "Suppression réussite";

	}
	@PutMapping("update")
	public Salle updateSalle(@RequestBody  Salle sal)
	{
		
	
		return salleService.persistSalle(sal);
		 
	}
	
	
	 
	/*@PutMapping("{id}")
	public String updateEtudiant (@RequestBody Etudiant e,@PathVariable Long id) {
		System.out.println("aaaaaaaaaaaaaaaaa");
		System.out.println("Etudiant:"+e+"id"+id);
		Etudiant ee=etudiantService.findEtudiantById(e.getIdEtud()); 	
		
		 etudiantService.persistEtudiant(e);
			return "updateEtudiant réussite";
	}*/

}

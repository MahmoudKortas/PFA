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
import epi.PFA.entities.Sujet;
import epi.PFA.sevice.EtudiantService;
import epi.PFA.sevice.SujetService;



@CrossOrigin("*")
@RestController
@RequestMapping("/api/sujets/")
public class RestSujetController {
	
	
	@Autowired
	SujetService sujetService;
@GetMapping("all")
	public List<Sujet> all (){ 
		return sujetService.getAllSujets();

	}

	@GetMapping ("{id}")
	public Sujet getSujet (@PathVariable Long id) {

	return sujetService.findSujetById(id);

	}

	@PostMapping("add")
	public Sujet addSujet (@RequestBody Sujet s) { 
		return sujetService.persistSujet(s);

	}

	@DeleteMapping("{id}")
	public  String deleteSujet (@PathVariable Long id) { 
		sujetService.deleteSujet(id); 
		return "Suppression réussite";

	}
	@PutMapping("update")
	public Sujet updateSujet(@RequestBody  Sujet suj)
	{
		
	
		return sujetService.persistSujet(suj);
		 
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

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


import epi.PFA.entities.Departement;

import epi.PFA.sevice.DepartementService;



@CrossOrigin("*")
@RestController
@RequestMapping("/api/departement/")
public class RestDepartementController {
	
	
	@Autowired
	DepartementService departementService;
@GetMapping("all")
	public List<Departement> all (){ 
		return departementService.getAllDepartements();

	}

	@GetMapping ("{id}")
	public Departement getDepartement (@PathVariable Long id) {

	return departementService.findDepartementById(id);

	}

	@PostMapping("add")
	public Departement addDepartement (@RequestBody Departement s) { 
		return departementService.persistDepartement(s);

	}

	@DeleteMapping("{id}")
	public  String deleteDepartement (@PathVariable Long id) { 
		departementService.deleteDepartement(id); 
		return "Suppression réussite";

	}
	@PutMapping("update")
	public Departement updateDepartement(@RequestBody  Departement sal)
	{
		
	
		return departementService.persistDepartement(sal);
		 
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

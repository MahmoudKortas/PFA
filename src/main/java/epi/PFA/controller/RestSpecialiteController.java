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


import epi.PFA.entities.Specialite;

import epi.PFA.sevice.SpecialiteService;



@CrossOrigin("*")
@RestController
@RequestMapping("/api/specialite/")
public class RestSpecialiteController {
	
	
	@Autowired
	SpecialiteService specialiteService;
@GetMapping("all")
	public List<Specialite> all (){ 
		return specialiteService.getAllSpecialites();

	}

	@GetMapping ("{id}")
	public Specialite getSpecialite (@PathVariable Long id) {

	return specialiteService.findSpecialiteById(id);

	}

	@PostMapping("add")
	public Specialite addSpecialite (@RequestBody Specialite s) { 
		return specialiteService.persistSpecialite(s);

	}

	@DeleteMapping("{id}")
	public  String deleteSpecialite (@PathVariable Long id) { 
		specialiteService.deleteSpecialite(id); 
		return "Suppression réussite";

	}
	@PutMapping("update")
	public Specialite updateSpecialite(@RequestBody  Specialite sal)
	{
		
	
		return specialiteService.persistSpecialite(sal);
		 
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

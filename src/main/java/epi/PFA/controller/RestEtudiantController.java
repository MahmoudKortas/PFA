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

import epi.PFA.entities.Etudiant;
import epi.PFA.sevice.EtudiantService;



@CrossOrigin("*")
@RestController
@RequestMapping("/api/etudiants/")
public class RestEtudiantController {
	
	
	@Autowired
	EtudiantService etudiantService;
@GetMapping()
	public List<Etudiant> all (){ 
		return etudiantService.getAllEtudiants();

	}

	@GetMapping ("{id}")
	public Etudiant getEtudiant (@PathVariable Long id) {

	return etudiantService.findEtudiantById(id);

	}

	@PostMapping("add")
	public Etudiant addEtudiant (@RequestBody Etudiant e) { 
		return etudiantService.persistEtudiant(e);

	}

	@DeleteMapping("{id}")
	public  String deleteEtudiant (@PathVariable Long id) { 
		etudiantService.deleteEtudiant(id); 
		return "Suppression réussite";

	}

	@PutMapping("{id}")
	public String updateEtudiant (@RequestBody Etudiant e,@PathVariable Long id) {
		System.out.println("aaaaaaaaaaaaaaaaa");
		System.out.println("Etudiant:"+e+"id"+id);
		Etudiant ee=etudiantService.findEtudiantById(e.getIdEtud()); 	
		
		 etudiantService.persistEtudiant(e);
			return "updateEtudiant réussite";
	}

}

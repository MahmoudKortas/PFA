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

import epi.PFA.entities.Enseignant;
import epi.PFA.entities.Etudiant;
import epi.PFA.sevice.EnseignantService;
import epi.PFA.sevice.EtudiantService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/enseignants/")
public class RestEnseignantController {
	
	
	@Autowired
	EnseignantService enseignantService;
	
    @GetMapping("all")
	public List<Enseignant> all(){ 
		return enseignantService.getAllEnseignants();

	}

	@GetMapping ("{id}")
	public Enseignant getEnseignant (@PathVariable Long id) {

	return enseignantService.findEnseignantById(id);

	}

	@PostMapping("add")
	public Enseignant addChaine (@RequestBody Enseignant e) { 
		return enseignantService.persistEnseignant(e);

	}

	@DeleteMapping("{id}")

	public  String deleteEnseignant(@PathVariable Long id) { 
			enseignantService.deleteEnseignant(id); 
			return "Suppression réussite";

	}
	@GetMapping("edit/{id}")
	public String editEnseignant(@PathVariable Long id, Model model) {
		model.addAttribute("enseignant", enseignantService.findEnseignantById(id));
		
		return "editEnseignant";
	}
	
	@PutMapping("update")
	public Enseignant updateEnseignant(@RequestBody  Enseignant en)
	{
		 return enseignantService.persistEnseignant(en);
		
	}

}

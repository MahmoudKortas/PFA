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

import epi.PFA.entities.LigneSoutenance;
import epi.PFA.sevice.LigneSoutenanceService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/LigneSoutenance/")
public class RestLigneSoutenanceController {
	
	
	@Autowired
	
	LigneSoutenanceService LigneSoutenanceService;
@GetMapping("all")
	public List<LigneSoutenance> all (){ 
		return LigneSoutenanceService.getAllLigneSoutenances();

	}

	@GetMapping ("{id}")
	public LigneSoutenance getLigneSoutenance (@PathVariable Long id) {

	return LigneSoutenanceService.findLigneSoutenanceById(id);

	}

	@PostMapping("add")
	public LigneSoutenance addChaine (@RequestBody LigneSoutenance s) { 
		return LigneSoutenanceService.persistLigneSoutenance(s);

	}

	@DeleteMapping("{id}")
	public String deleteChaine (@PathVariable Long id) { 
		LigneSoutenanceService.deleteLigneSoutenance(id); 
		return "Suppression réussite"; 
	} 

	@PutMapping("update")
	public LigneSoutenance updateLigneSoutenance(@RequestBody LigneSoutenance s) {
		return LigneSoutenanceService.persistLigneSoutenance(s);
	}

}

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

import epi.PFA.entities.Soutenance;
import epi.PFA.sevice.SoutenanceService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/soutenance/")
public class RestSoutenanceController {
	
	
	@Autowired
	
	SoutenanceService soutenanceService;
@GetMapping("all")
	public List<Soutenance> all (){ 
		return soutenanceService.getAllSoutenance();

	}

	@GetMapping ("{id}")
	public Soutenance getSoutenance (@PathVariable Long id) {

	return soutenanceService.findSoutenanceById(id);

	}

	@PostMapping("add")
	public Soutenance addChaine (@RequestBody Soutenance p) { 
		return soutenanceService.persistSoutenance(p);

	}

	@DeleteMapping("{id}")
	public void deleteChaine (@PathVariable Long id) { 
		soutenanceService.deleteSoutenance(id); 
		//return "Suppression réussite"; 
	} 

	@PutMapping("update")
	public Soutenance updateSoutenance(@RequestBody Soutenance p) {
		return soutenanceService.persistSoutenance(p);
	}

}

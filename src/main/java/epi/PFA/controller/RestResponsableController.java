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
import epi.PFA.entities.Responsable;
import epi.PFA.sevice.EtudiantService;
import epi.PFA.sevice.ResponsableService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/responsable/")
public class RestResponsableController {

	@Autowired
	ResponsableService responsableService;

	@GetMapping()
	public List<Responsable> all() {
		return responsableService.getAllResponsable();

	}

	@GetMapping("{id}")
	public Responsable getResponsable(@PathVariable Long id) {

		return responsableService.findResponsableById(id);

	}

	@PostMapping("add")
	public Responsable addChaine(@RequestBody Responsable e) {
		return responsableService.persistResponsable(e);

	}

	@DeleteMapping("{id}")
	public void deleteChaine(@PathVariable Long id) {
		responsableService.deleteResponsable(id);
		//return "Suppression réussite";
	}

	@PutMapping("update")
	public Responsable updateResponsable(@RequestBody Responsable p) {
		return responsableService.persistResponsable(p);
	}

}

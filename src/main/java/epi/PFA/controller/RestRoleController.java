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
import epi.PFA.entities.Role;
import epi.PFA.entities.Salle;
import epi.PFA.sevice.EtudiantService;
import epi.PFA.sevice.RoleService;
import epi.PFA.sevice.SalleService;



@CrossOrigin("*")
@RestController
@RequestMapping("/api/role/")
public class RestRoleController {
	
	
	@Autowired
	RoleService roleService;
@GetMapping("all")
	public List<Role> all (){ 
		return roleService.getAllRoles();

	}

	@GetMapping ("{id}")
	public Role getRole (@PathVariable Long id) {

	return roleService.findRoleById(id);

	}

	@PostMapping("add")
	public Role addRole (@RequestBody Role s) { 
		return roleService.persistRole(s);

	}

	@DeleteMapping("{id}")
	public  String deleteRole (@PathVariable Long id) { 
		roleService.deleteRole(id); 
		return "Suppression réussite";

	}
	@PutMapping("update")
	public Role updateRole(@RequestBody  Role r)
	{
		
	
		return roleService.persistRole(r);
		 
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

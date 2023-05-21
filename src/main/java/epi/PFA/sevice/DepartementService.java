package epi.PFA.sevice;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import epi.PFA.entities.Departement;

import epi.PFA.repository.DepartementRepository;

@Service

public class DepartementService {
	@Autowired
DepartementRepository departementRepository;
	
	
	
	public List<Departement> getAllDepartements() {
		
		return departementRepository.findAll();
	}

	public Departement persistDepartement(Departement s) {
		return  departementRepository.save(s);
	}
	
	public void deleteDepartement(Long id) {
		departementRepository.deleteById(id);		
		
	}
	

	
	
	public Departement findDepartementById(Long id) {
		return departementRepository.findById(id).get();
	}
	

}	


	





	
		





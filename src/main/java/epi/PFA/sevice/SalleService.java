package epi.PFA.sevice;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import epi.PFA.entities.Etudiant;
import epi.PFA.entities.Salle;
import epi.PFA.repository.EtudiantRepository;
import epi.PFA.repository.SalleRepository;

@Service

public class SalleService {
	@Autowired
SalleRepository salleRepository;
	
	
	
	public List<Salle> getAllSalles() {
		
		return salleRepository.findAll();
	}

	public Salle persistSalle(Salle s) {
		return  salleRepository.save(s);
	}
	
	public void deleteSalle(Long id) {
		salleRepository.deleteById(id);		
		
	}
	

	
	
	public Salle findSalleById(Long id) {
		return salleRepository.findById(id).get();
	}
	

}	


	





	
		





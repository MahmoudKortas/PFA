package epi.PFA.sevice;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import epi.PFA.entities.Enseignant;
import epi.PFA.entities.Etudiant;
import epi.PFA.entities.PFE;
import epi.PFA.repository.EnseignantRepository;
import epi.PFA.repository.EtudiantRepository;
import epi.PFA.repository.PFERepository;

@Service

public class PFEService {
	@Autowired
PFERepository pfeRepository;
	
	
	
	public List<PFE> getAllPfes() {
		
		return pfeRepository.findAll();
	}

	public PFE persistPFE(PFE p) {
		return  pfeRepository.save(p);
	}
	
	public void deletePFE(Long id) {
		pfeRepository.deleteById(id);		
		
	}

	
	
	public PFE findPFEById(Long id) {
		return pfeRepository.findById(id).get();
	}
	

}	


	





	
		





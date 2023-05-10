package epi.PFA.sevice;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import epi.PFA.entities.Enseignant;
import epi.PFA.entities.Etudiant;
import epi.PFA.repository.EnseignantRepository;
import epi.PFA.repository.EtudiantRepository;

@Service

public class EnseignantService {
	@Autowired
EnseignantRepository enseignantRepository;
	
	
	
	public List<Enseignant> getAllEnseignants() {
		
		return enseignantRepository.findAll();
	}

	public Enseignant persistEnseignant(Enseignant en) {
		return  enseignantRepository.save(en);
	}
	
	public void deleteEnseignant(Long id) {
		enseignantRepository.deleteById(id);		
		
	}

	public  List<Enseignant> findenseignantsByNom(String mc) {
		// TODO Auto-generated method stub
		return enseignantRepository.findByNomContains(mc);
	}
	
	public Enseignant findEnseignantById(Long id) {
		return enseignantRepository.findById(id).get();
	}
	

}	


	





	
		





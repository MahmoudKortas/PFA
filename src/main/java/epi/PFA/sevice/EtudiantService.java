package epi.PFA.sevice;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import epi.PFA.entities.Etudiant;
import epi.PFA.repository.EtudiantRepository;

@Service

public class EtudiantService {
	@Autowired
EtudiantRepository etudiantRepository;
	
	
	
	public List<Etudiant> getAllEtudiants() {
		
		return etudiantRepository.findAll();
	}

	public Etudiant persistEtudiant(Etudiant e) {
		return  etudiantRepository.save(e);
	}
	
	public void deleteEtudiant(Long id) {
		etudiantRepository.deleteById(id);		
		
	}
	

	public  List<Etudiant> findetudiantsByNom(String mc) {
		// TODO Auto-generated method stub
		return etudiantRepository.findByNomContains(mc);
	}
	
	public Etudiant findEtudiantById(Long id) {
		return etudiantRepository.findById(id).get();
	}
	

}	


	





	
		





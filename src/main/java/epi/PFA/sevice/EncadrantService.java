package epi.PFA.sevice;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import epi.PFA.entities.Encadrant;
import epi.PFA.entities.Etudiant;
import epi.PFA.repository.EncadrantRepository;
import epi.PFA.repository.EtudiantRepository;

@Service

public class EncadrantService {
	@Autowired
EncadrantRepository encadrantRepository;
	
	
	
	public List<Encadrant> getAllEncadrants() {
		
		return encadrantRepository.findAll();
	}

	public Encadrant persistEncadrant(Encadrant en) {
		return  encadrantRepository.save(en);
	}
	
	public void deleteEncadrant(Long id) {
		encadrantRepository.deleteById(id);		
		
	}

	public  List<Encadrant> findencadrantsByNom(String mc) {
		// TODO Auto-generated method stub
		return encadrantRepository.findByNomContains(mc);
	}
	
	public Encadrant findEncadrantById(Long id) {
		return encadrantRepository.findById(id).get();
	}
	

}	


	





	
		





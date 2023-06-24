package epi.PFA.sevice;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import epi.PFA.entities.Sujet;
import epi.PFA.repository.SujetRepository;

@Service

public class SujetService {
	@Autowired
SujetRepository sujetRepository;
	
	
	
	public List<Sujet> getAllSujets() {
		
		return sujetRepository.findAll();
	}

	public Sujet persistSujet(Sujet s) {
		return  sujetRepository.save(s);
	}
	
	public void deleteSujet(Long id) {
		sujetRepository.deleteById(id);		
		
	}
	

	
	
	public Sujet findSujetById(Long id) {
		return sujetRepository.findById(id).get();
	}
	

}	


	





	
		





package epi.PFA.sevice;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import epi.PFA.entities.Specialite;

import epi.PFA.repository.SpecialiteRepository;

@Service

public class SpecialiteService {
	@Autowired
SpecialiteRepository specialiteRepository;
	
	
	
	public List<Specialite> getAllSpecialites() {
		
		return specialiteRepository.findAll();
	}

	public Specialite persistSpecialite(Specialite s) {
		return  specialiteRepository.save(s);
	}
	
	public void deleteSpecialite(Long id) {
		specialiteRepository.deleteById(id);		
		
	}
	

	
	
	public Specialite findSpecialiteById(Long id) {
		return specialiteRepository.findById(id).get();
	}
	

}	


	





	
		





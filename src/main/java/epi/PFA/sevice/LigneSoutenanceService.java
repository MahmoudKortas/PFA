package epi.PFA.sevice;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import epi.PFA.entities.LigneSoutenance;
import epi.PFA.repository.LigneSoutenanceRepository;


@Service

public class LigneSoutenanceService {
	@Autowired
LigneSoutenanceRepository ligneSoutenanceRepository;
	
	
	
	public List<LigneSoutenance> getAllLigneSoutenances() {
		
		return ligneSoutenanceRepository.findAll();
	}

	public LigneSoutenance persistLigneSoutenance(LigneSoutenance s) {
		return  ligneSoutenanceRepository.save(s);
	}
	
	public void deleteLigneSoutenance(Long id) {
		ligneSoutenanceRepository.deleteById(id);		
		
	}
	

	
	
	public LigneSoutenance findLigneSoutenanceById(Long id) {
		return ligneSoutenanceRepository.findById(id).get();
	}
	

}	


	





	
		





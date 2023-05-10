package epi.PFA.sevice;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import epi.PFA.entities.Soutenance;



import epi.PFA.repository.SoutenanceRepository;

@Service

public class SoutenanceService {
	@Autowired
SoutenanceRepository soutenanceRepository;
	
	
	
	public List<Soutenance> getAllSoutenance() {
		
		return soutenanceRepository.findAll();
	}

	public Soutenance persistSoutenance(Soutenance p) {
		return  soutenanceRepository.save(p);
	}
	
	public void deleteSoutenance(Long id) {
		soutenanceRepository.deleteById(id);		
		
	}

	
	
	public Soutenance findSoutenanceById(Long id) {
		return soutenanceRepository.findById(id).get();
	}
	

}	


	





	
		





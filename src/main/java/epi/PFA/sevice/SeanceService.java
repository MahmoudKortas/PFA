package epi.PFA.sevice;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import epi.PFA.entities.Etudiant;
import epi.PFA.entities.Salle;
import epi.PFA.entities.Seance;
import epi.PFA.repository.EtudiantRepository;
import epi.PFA.repository.SalleRepository;
import epi.PFA.repository.SeanceRepository;

@Service

public class SeanceService {
	@Autowired
	SeanceRepository seanceRepository;
	
	
	
	public List<Seance> getAllSeance() {
		
		return seanceRepository.findAll();
	}

	
	
	public void deleteSeance(Long id) {
		seanceRepository.deleteById(id);		
		
	}
	

	
	
	public Seance findSeanceById(Long id) {
		return seanceRepository.findById(id).get();
	}

	public Seance persistSeance(Seance se) {
		// TODO Auto-generated method stub
		return  seanceRepository.save(se);
	}
	

}	


	





	
		





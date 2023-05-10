package epi.PFA.sevice;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import epi.PFA.entities.Responsable;
import epi.PFA.repository.ResponsableRepository;




@Service

public class ResponsableService {
	@Autowired
ResponsableRepository responsableRepository;
	
	
	
	public List<Responsable> getAllResponsable() {
		
		return responsableRepository.findAll();
	}

	public Responsable persistResponsable(Responsable p) {
		return  responsableRepository.save(p);
	}
	
	public void deleteResponsable(Long id) {
		responsableRepository.deleteById(id);		
		
	}

	
	
	public Responsable findResponsableById(Long id) {
		return responsableRepository.findById(id).get();
	}
	

}	


	





	
		





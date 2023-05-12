package epi.PFA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import epi.PFA.entities.Etudiant;
import epi.PFA.entities.PFE;



public interface PFERepository extends JpaRepository<PFE, Long>{

	@Query("select p from PFE p where p.etudiant.id=?1")
	List<PFE> rechercheParEtudiant(long id);	
	List<PFE> findBytitleContains(String mc);
}

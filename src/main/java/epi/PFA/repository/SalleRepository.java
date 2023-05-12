package epi.PFA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import epi.PFA.entities.Etudiant;
import epi.PFA.entities.Salle;
@Repository

public interface SalleRepository extends JpaRepository<Salle, Long>{

	
}

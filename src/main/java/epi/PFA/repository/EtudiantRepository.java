package epi.PFA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import epi.PFA.entities.Etudiant;
@Repository

public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{

	List<Etudiant> findByNomContains(String mc);
}

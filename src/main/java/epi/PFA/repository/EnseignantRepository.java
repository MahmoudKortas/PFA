package epi.PFA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import epi.PFA.entities.Enseignant;



public interface EnseignantRepository extends JpaRepository<Enseignant, Long>{

	List<Enseignant> findByNomContains(String mc);

}

package epi.PFA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import epi.PFA.entities.LigneSoutenance;

//import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@Repository

public interface LigneSoutenanceRepository extends JpaRepository<LigneSoutenance, Long>{

	
}

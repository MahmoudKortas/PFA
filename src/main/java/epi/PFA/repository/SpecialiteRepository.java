package epi.PFA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import epi.PFA.entities.Specialite;
@Repository

public interface SpecialiteRepository extends JpaRepository<Specialite, Long>{

	
}

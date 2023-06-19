package epi.PFA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import epi.PFA.entities.Encadrant;



public interface EncadrantRepository extends JpaRepository<Encadrant, Long>{

	List<Encadrant> findByNomContains(String mc);

}

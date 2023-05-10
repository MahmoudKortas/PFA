package epi.PFA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import epi.PFA.entities.Document;


public interface DocumentRepository extends JpaRepository<Document, Long> {

}

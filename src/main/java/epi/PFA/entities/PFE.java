package epi.PFA.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class PFE {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idPFE;
	
	private String dateDebut;
	private String dateDepot;
	

	@ManyToOne
	private Etudiant etudiant;
	@ManyToOne
	private Encadrant encadrant;
	@ManyToOne
	private Sujet sujet;
	@ManyToOne
	private Document document;
}

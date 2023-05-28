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
	private String title;
	private String dateDebut;
	private Date dateDepot;
	private String domaine;
	private double note;

	@ManyToOne
	private Etudiant etudiant;
	@ManyToOne
	private Enseignant encadreur;
	@ManyToOne
	private Enseignant rapporteur;
	@ManyToOne
	private Enseignant president;
	@ManyToOne
	private Salle salle;
	@ManyToOne
	private Seance seance;
}

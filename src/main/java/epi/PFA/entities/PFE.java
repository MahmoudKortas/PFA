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
	private Date dateDebut;
	private Date dateFin;
	private String domaine;
	private double note;

	@ManyToOne
	private Etudiant etudiant;
	@ManyToOne
	private Enseignant encadreur;
	@ManyToOne
	private Document document;

}

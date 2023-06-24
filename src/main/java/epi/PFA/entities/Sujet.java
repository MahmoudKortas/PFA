package epi.PFA.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Sujet {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idDoc;
	private String titre;
	private String description;
	private String date;
	
	@ManyToOne
	private Etudiant etudiant;
	@ManyToOne
	private Responsable responsable;
	@ManyToOne
	private Encadrant encadrant;
}

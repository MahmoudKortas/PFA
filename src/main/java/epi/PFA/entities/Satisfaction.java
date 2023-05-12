package epi.PFA.entities;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity

public class Satisfaction {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idSatisf;
	private String nom;
	private String prenom;
	private int tel;
	private String avis ;
	private String email;
	
	/*
	@OneToMany(mappedBy="etudiant")

	List<PFE> etudiants;*/

	   
	
}

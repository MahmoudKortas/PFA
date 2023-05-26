package epi.PFA.entities;


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

public class Etudiant {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idEtud;
	private String nom;
	private String prenom;
	private int tel;
	private String adresse;
	private String niveau ;

	private String email;
	private String motdepasse;
	
	@ManyToOne
	private Departement departement;
	@ManyToOne
	private Specialite specialite;
	
	
	/*@OneToMany(mappedBy="etudiant")

	List<PFE> etudiants;*/

	   
	
}

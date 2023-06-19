package epi.PFA.entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
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

public class Encadrant{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idEns;
	private String nom;
	private String prenom;
	private int tel;
	private String adresse;
	private String domaine;
	private String email;
	private String motdepasse;
	
	@ManyToOne
	private Departement departement;
	
	
	
	/*@OneToMany(mappedBy="rapporteur")
	List<PFE> rappoteurs;
	
	@OneToMany(mappedBy="president")
	
	List<PFE> presidents;*/
	
/*@OneToMany(mappedBy="encadreur")
	
	List<PFE> encadreurs;*/
	

}

package epi.PFA.entities;

import java.util.List;

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
public class Responsable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private long idUser;
	private String Nom;
	private String Prenom;
	private String email;
	private String Tel;
	private String motdepasse;
	private String Date_responsabilite;
	
	@ManyToOne
	private Departement departement;
}

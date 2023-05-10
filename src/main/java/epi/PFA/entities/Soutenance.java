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
public class Soutenance {
	 @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
private long idSout;
private Date date;
private Date heuredebut;
private Date heurefin;
private String salle;

@ManyToOne
private Enseignant rapporteur;
@ManyToOne
private Enseignant president;

@ManyToOne
private PFE pfe;

}

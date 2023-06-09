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
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private long idSout;
private String Description;	 
private String date;
private String Etat;


@ManyToOne
private Encadrant rapporteur;
@ManyToOne
private Encadrant president;
@ManyToOne
private Salle salle;
@ManyToOne
private Seance seance;


@ManyToOne
private PFE pfe;

}

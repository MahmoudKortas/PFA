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
public class Ligne_Soutenance {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private long idLigne;
private Double Note_rapport ;	 
private Double Note_QR;
private Double Note_presentation;
private Double Note_application;




@ManyToOne
private PFE pfe;

}

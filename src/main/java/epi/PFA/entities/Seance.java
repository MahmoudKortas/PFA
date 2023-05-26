package epi.PFA.entities;

import java.util.Date;
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
public class Seance {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idSeance;

	private String Nom;
	
	/*@OneToMany(mappedBy="seance")

	List<PFE> seances;*/


}

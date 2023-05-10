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
public class Document {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idDoc;
	private String titre;
	private String description;
	private String proprietaire;
	private Date datedepot;
	private String photo;
	/*@OneToMany(mappedBy="document")

	List<PFE> documents;*/


}

package epi.PFA.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Data
@Entity
public class Responsable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private long idUser;
	private String login;
	private String motdepasse;
	

}

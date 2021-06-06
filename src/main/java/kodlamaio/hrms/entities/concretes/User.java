package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name="users")
@AllArgsConstructor
public class User {

	public User() {}
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="email")
	private String eMail;
	
	@Column(name="password")
	private String password;
	
//	@OneToOne(mappedBy="user")
//	private Employer employer;
//	
//	@OneToOne(mappedBy="id")
//	private Candidate candidate;
//	
//	@OneToOne(mappedBy="id")
//	private SystemUser systemUser;
	
}

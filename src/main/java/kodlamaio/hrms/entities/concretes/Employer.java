package kodlamaio.hrms.entities.concretes;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name="employers")
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisement"})
public class Employer {
	
	public Employer() {}
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="web_site")
	private String web_site;
	
	@Column(name="phone")
	private String phone;
	
	@OneToMany(mappedBy="employer")
	private List<JobAdvertisement>jobAdvertisement;
	
//	@OneToOne()
//	@JoinColumn(name="id",referencedColumnName = "id")
//	private User user;

}

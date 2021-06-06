package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="job_titles")
@AllArgsConstructor
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisement"})
public class JobTittle {
	
	public JobTittle() {
		
	}
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="tittle")
	private String tittle;
	
	@OneToMany(mappedBy="jobTittle")
	private List<JobAdvertisement>jobAdvertisement;

}

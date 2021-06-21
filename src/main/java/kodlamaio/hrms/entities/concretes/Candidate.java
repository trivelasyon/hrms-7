package kodlamaio.hrms.entities.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name="candidates")
@AllArgsConstructor

public class Candidate {
	
	public Candidate() {
		
	}

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surName;
	
	@Column(name="identity_number")
	private String identityNumber;
	
	@Column(name="birth_date")
	private Date birth_date;
	
	@OneToMany(mappedBy="candidate")
	private List<CvEducation>cvEducation;
	
	@OneToMany(mappedBy="candidate")
	private List<CvExperiences>cvExperiences;
	
	@OneToMany(mappedBy="candidate")
	private List<CvLanguages>cvLangugages;
	
	@OneToMany(mappedBy="candidate")
	private List<CvLinks>cvLinks;
	
	@OneToMany(mappedBy="candidate")
	private List<CvNotes>cvNotes;
	
	@OneToMany(mappedBy="candidate")
	private List<CvPhoto>cvPhoto;
	
	@OneToMany(mappedBy="candidate")
	private List<CvSkills>cvSkills;
	


	
}

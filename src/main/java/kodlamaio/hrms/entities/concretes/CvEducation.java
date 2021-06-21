package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="cv_education")
@AllArgsConstructor
@NoArgsConstructor
public class CvEducation {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name="candidates_id",referencedColumnName = "id")
	private Candidate candidate;
	@Column(name="school")
	private String school;
	@Column(name="start_education")
	private Date start_education;
	@Column(name="finish_education")
	private Date finish_education;
	@Column(name="status")
	private String status;

}

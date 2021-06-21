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
@Table(name="cv_experiences")
@AllArgsConstructor
@NoArgsConstructor
public class CvExperiences {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name="candidates_id",referencedColumnName = "id")
	private Candidate candidate;
	@Column(name="workplace")
	private String workplace;
	@Column(name="position")
	private String position;
	@Column(name="status")
	private String status;
	@Column(name="workplace_start")
	private Date workplace_start;
	@Column(name="workplace_finish")
	private Date workplace_finish;

}

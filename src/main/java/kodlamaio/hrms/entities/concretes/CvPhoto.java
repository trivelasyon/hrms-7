package kodlamaio.hrms.entities.concretes;

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
@Table(name="cv_photo")
@AllArgsConstructor
@NoArgsConstructor
public class CvPhoto {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name="candidates_id",referencedColumnName = "id")
	private Candidate candidate;
	@Column(name="cv_photo")
	private String cv_photo;
	@Column(name="cv_pdf")
	private String cv_pdf;
}

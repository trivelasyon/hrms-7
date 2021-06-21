package kodlamaio.hrms.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvEducationWithCandidateDto {
	
	private int id;
	
	private String name;
	
	private String surName;
	
	private String school;
	
	private Date start_education;
	
	private Date finish_education;
	
	private String status;

}

package kodlamaio.hrms.entities.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvSkillsWithCandidateDto {
	
	private int id;
	
	private String name;
	
	private String surName;
	
	private int identityNumber;
	
	private String skills;

}

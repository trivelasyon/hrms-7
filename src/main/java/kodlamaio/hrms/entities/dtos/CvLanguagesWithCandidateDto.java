package kodlamaio.hrms.entities.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvLanguagesWithCandidateDto {
	
    private int id;
	
	private String name;
	
	private String surName;
	
	private String languages;
	
	private int language_level;
	
	

}

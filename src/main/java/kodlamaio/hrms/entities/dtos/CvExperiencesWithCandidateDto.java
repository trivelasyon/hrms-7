package kodlamaio.hrms.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvExperiencesWithCandidateDto {
	
	    private int id;
		
		private String name;
		
		private String surName;
   
		private String workplace;
		
		private String position;
		
		private String status;
		
		private Date workplace_start;
		 
		private Date workplace_finish;
}

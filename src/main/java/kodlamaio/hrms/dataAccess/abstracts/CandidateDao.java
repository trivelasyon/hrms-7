package kodlamaio.hrms.dataAccess.abstracts;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.dtos.CvEducationWithCandidateDto;
import kodlamaio.hrms.entities.dtos.CvLanguagesWithCandidateDto;
import kodlamaio.hrms.entities.dtos.CvExperiencesWithCandidateDto;


@Repository
public interface CandidateDao extends JpaRepository<Candidate,Integer>  {
	
	@Query("Select new kodlamaio.hrms.entities.dtos.CvEducationWithCandidateDto(p.id,c.name,c.surName,p.school,p.start_education,p.finish_education,p.status) From Candidate c Inner Join c.cvEducation p")
	List<CvEducationWithCandidateDto> getCvEducationWithCandidate();
	
	@Query("Select new kodlamaio.hrms.entities.dtos.CvLanguagesWithCandidateDto(p.id,c.name,c.surName,p.languages,p.language_level) From Candidate c Inner Join c.cvLangugages p")
	List<CvLanguagesWithCandidateDto> getCvLanguagesWithCandidate();
	
	
	@Query("Select new kodlamaio.hrms.entities.dtos.CvExperiencesWithCandidateDto(p.id,c.name,c.surName,p.workplace,p.position,p.status,p.workplace_start,p.workplace_finish) From Candidate c Inner Join c.cvExperiences p")
	List<CvExperiencesWithCandidateDto> getCvExperiencessWithCandidate();
	
	@Modifying
	@Query("update CvExperiences u set u.position = :position where u.candidate = :candidate_id")
	void setCvPosition(@Param("position") String position,@Param("candidate_id") int candidate_id);
   
}

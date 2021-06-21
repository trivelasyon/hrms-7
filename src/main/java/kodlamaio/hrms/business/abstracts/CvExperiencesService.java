package kodlamaio.hrms.business.abstracts;
import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.dtos.CvExperiencesWithCandidateDto;
import kodlamaio.hrms.entities.concretes.CvExperiences;
public interface CvExperiencesService {
	
	DataResult<List<CvExperiencesWithCandidateDto>> getCvExperiencesWithCandidates();
    Result updateCvExperience(int id , String position);
}

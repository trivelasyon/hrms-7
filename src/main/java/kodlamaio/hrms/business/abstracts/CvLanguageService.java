package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.dtos.CvEducationWithCandidateDto;
import kodlamaio.hrms.entities.dtos.CvLanguagesWithCandidateDto;

public interface CvLanguageService {

	DataResult<List<CvLanguagesWithCandidateDto>> getCvLangugagesWithCandidate();
	
}

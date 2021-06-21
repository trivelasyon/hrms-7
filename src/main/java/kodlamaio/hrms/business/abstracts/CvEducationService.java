package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.dtos.CvEducationWithCandidateDto;
import java.util.List;
import kodlamaio.hrms.core.utilities.results.DataResult;

public interface CvEducationService {

	DataResult<List<CvEducationWithCandidateDto>> getCvEducationWithCandidate();
	
}

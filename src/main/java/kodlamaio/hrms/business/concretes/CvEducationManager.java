package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CvEducationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.dtos.CvEducationWithCandidateDto;


@Service
public class CvEducationManager implements CvEducationService {

	private CandidateDao candidateDao;
	
	@Autowired
	public CvEducationManager(CandidateDao candidateDao) {
		this.candidateDao=candidateDao;
	}
	
	@Override
	public DataResult<List<CvEducationWithCandidateDto>> getCvEducationWithCandidate() {
		// TODO Auto-generated method stub
		return  new SuccessDataResult(this.candidateDao.getCvEducationWithCandidate(),"CV Education are Listed");
	}

}

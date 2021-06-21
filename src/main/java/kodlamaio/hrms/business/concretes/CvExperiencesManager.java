package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CvExperiencesService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.CvExperiences;
import kodlamaio.hrms.entities.dtos.CvExperiencesWithCandidateDto;

@Service
public class CvExperiencesManager implements CvExperiencesService {
	
	private CandidateDao candidateDao;
	@Autowired
	public CvExperiencesManager(CandidateDao candidateDao) {
	this.candidateDao=candidateDao;	
	}
	@Override
	public DataResult<List<CvExperiencesWithCandidateDto>> getCvExperiencesWithCandidates() {
		// TODO Auto-generated method stub
		return new SuccessDataResult(this.candidateDao.getCvExperiencessWithCandidate(),"cv deneyimleri listelendi");
	}
	@Override
	public Result updateCvExperience(int id, String position) {
		this.candidateDao.setCvPosition(position,id);
		return null;
	}

}

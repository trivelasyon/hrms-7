package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CvLanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.dtos.CvLanguagesWithCandidateDto;

@Service
public class CvLanguageManager implements CvLanguageService{

	
	private CandidateDao candidateDao;
	
	@Autowired
	public CvLanguageManager(CandidateDao candidateDao) {
		this.candidateDao=candidateDao;
	}
	
	@Override
	public DataResult<List<CvLanguagesWithCandidateDto>> getCvLangugagesWithCandidate() {
		
		return new SuccessDataResult(this.candidateDao.getCvLanguagesWithCandidate(),"Cv dil bilgileri alindi");
	}

}

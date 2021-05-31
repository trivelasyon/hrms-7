package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.RegisterUserService;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.Candidate;


public class RegisterCandidateManager implements RegisterUserService{

	
	private Candidate candidate;
	
	@Autowired
    public RegisterCandidateManager(Candidate candidate) {
		this.candidate=candidate;
	}
	
	@Override
	public Result registerUserControl() {
		if(candidate.getName().isEmpty()||candidate.getSurName().isEmpty()||candidate.getIdentityNumber().isBlank()||candidate.getBirth_date().toString().isEmpty()) {
			return new ErrorResult("Login paramaters are not null!");
		}
		else {
			return new SuccessResult("Register process is okay");
		}
	
		
	}

}

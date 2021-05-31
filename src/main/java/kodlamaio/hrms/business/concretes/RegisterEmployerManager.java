package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.RegisterUserService;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.Employer;


public class RegisterEmployerManager implements RegisterUserService {
	

	private Employer employer;
	
	@Autowired
	public RegisterEmployerManager(Employer employer){
		this.employer=employer;
	}

	@Override
	public Result registerUserControl() {
		 if(employer.getName().isEmpty() || employer.getPhone().isEmpty()|| employer.getWeb_site().isEmpty()) {
			 return new ErrorResult("Login paramaters are not null!");
		 }
		 else {
			 return new SuccessResult("Register process is okay");
		 }
	}

}

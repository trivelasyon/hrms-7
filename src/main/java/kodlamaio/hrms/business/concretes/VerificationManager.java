package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.VerificationService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.core.utilities.verification.VirtualVerificationManager;


public class VerificationManager implements VerificationService {
	
	private VirtualVerificationManager virtualVerificationManager;
	
	@Autowired
	public VerificationManager(VirtualVerificationManager virtualVerificationManager) {
		this.virtualVerificationManager=virtualVerificationManager;
	}

	@Override
	public Result verificateWithLink(String link) {
		this.virtualVerificationManager.verificateWithLink(link);
	    return new SuccessResult("Verificate link is sent");
		
	}

	@Override
	public Result verificateWithCode() {
		this.virtualVerificationManager.verificateWithCode();
		return new SuccessResult("Verificate code is sent");
	}

}

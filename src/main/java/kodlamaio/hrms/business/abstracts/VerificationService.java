package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;

public interface VerificationService {
	Result verificateWithLink(String link);
	Result verificateWithCode();

}

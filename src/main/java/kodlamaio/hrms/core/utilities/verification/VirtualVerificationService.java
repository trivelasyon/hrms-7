package kodlamaio.hrms.core.utilities.verification;

public interface VirtualVerificationService {
	
	void verificateWithLink(String email);
	String verificateWithCode();

}

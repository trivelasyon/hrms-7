package kodlamaio.hrms.core.utilities.verification;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.UUID;

public class VirtualVerificationManager implements VirtualVerificationService {

	@Override
	public void verificateWithLink(String email) {
		 UUID generatedString =UUID.randomUUID();
	        String verificationLink = "https://www.humanverificationlink.com/" + generatedString;
	        System.out.println("Verification code sended to : " + email);
	        System.out.println("Please click to link : " + verificationLink);
		
	}

	@Override
	public String verificateWithCode() {
		byte[] array = new byte[6]; // length is bounded by 6 - resource : https://www.baeldung.com/java-random-string
        new Random().nextBytes(array);
        String verificationCode = new String(array, Charset.forName("UTF-8"));
        System.out.println("Doğrulama kodunuz : " + verificationCode);
        return verificationCode;
	}

}

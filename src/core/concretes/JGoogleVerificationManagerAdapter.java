package core.concretes;

import JGoogleVerification.JGoogleVerificationManager;
import core.abstracts.JGoogleVerificationService;
import entities.concretes.User;

public class JGoogleVerificationManagerAdapter implements JGoogleVerificationService {

	@Override
	public void googleVerify(User user) {
		JGoogleVerificationManager manager = new JGoogleVerificationManager();
		manager.verify(user);
	}

}

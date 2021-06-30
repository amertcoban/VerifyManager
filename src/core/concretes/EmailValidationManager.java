package core.concretes;

import core.abstracts.EmailVerificationService;
import entities.concretes.User;

public class EmailValidationManager implements EmailVerificationService {

	@Override
	public boolean emailVerification(User user) {
		System.out.println("Mr/Mrs " + user.getFirstName()+ "please verify your email via the link we sent.");
		return false;
	}
	

}

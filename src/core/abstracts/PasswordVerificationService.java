package core.abstracts;

import entities.concretes.User;

public interface PasswordVerificationService {
	
	boolean passwordVerification (User user);

}

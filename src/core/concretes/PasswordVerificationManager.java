package core.concretes;

import core.abstracts.PasswordVerificationService;
import entities.concretes.User;

public class PasswordVerificationManager implements PasswordVerificationService {

	@Override
	public boolean passwordVerification(User user) {
		
		if (user.getPassword().length()<=5) {
			System.out.println("Its not a valid password.Password must be minumum 6 charecter.");
		} else {System.out.println("Password succesfully accepted.");} 
		return true;
		
		
	
	}

}

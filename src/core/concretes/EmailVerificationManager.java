package core.concretes;

import java.util.regex.Pattern;
import core.abstracts.EmailVerificationService;
import entities.concretes.User;

public class EmailVerificationManager implements EmailVerificationService {

	@Override
	public boolean emailVerification(User user) {
		String regex = "[a-zA-Z+.com]";
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(user.getEmail()).find();
		
	
	}
	
}
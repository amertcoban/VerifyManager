package core.concretes;

import core.abstracts.LoginService;
import entities.concretes.User;

public class LoginManager implements LoginService {

	@Override
	public boolean login(User user) {
		
		if (user.getEmail().isEmpty() || user.getPassword().isEmpty()==true) {
		System.out.println("Fill the blanks please.");
		} return true; 
	
	}

}

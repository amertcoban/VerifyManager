package business.abstracts;

import entities.concretes.User;

public interface UserService {
	
	boolean emailVerification(User user);
	boolean firstNameAdd(User user);
	boolean lastNameAdd (User user);
	boolean passwordVerification (User user);
	void register(User user);
	void verifyWithGoogle(User user);
	

}

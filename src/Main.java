
import business.abstracts.UserService;
import business.concretes.UserManager;
import core.concretes.EmailVerificationManager;
import core.concretes.FirstNameManager;
import core.concretes.JGoogleVerificationManagerAdapter;
import core.concretes.LastNameManager;
import core.concretes.LoginManager;
import core.concretes.PasswordVerificationManager;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
	
		User user1 = new User ("","C","ABC","");
		UserService userService = new UserManager(new EmailVerificationManager(), new FirstNameManager(), new LastNameManager(), new PasswordVerificationManager(),new LoginManager(),new JGoogleVerificationManagerAdapter()) ;
		userService.emailVerification(user1);
		userService.firstNameAdd(user1);
		userService.lastNameAdd(user1);
		userService.passwordVerification(user1);
		userService.register(user1);
		userService.verifyWithGoogle(user1);
	}

}

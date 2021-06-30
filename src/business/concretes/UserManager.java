package business.concretes;


import business.abstracts.UserService;
import core.abstracts.EmailVerificationService;
import core.abstracts.FirstNameService;
import core.abstracts.JGoogleVerificationService;
import core.abstracts.LastNameService;
import core.abstracts.LoginService;
import core.abstracts.PasswordVerificationService;
import entities.concretes.User;

public class UserManager implements UserService{

	
	private EmailVerificationService emailVerificationService;
	private FirstNameService firstNameService;
	private LastNameService lastNameService;
	private PasswordVerificationService passwordVerificationService;
	private LoginService loginService;
	private JGoogleVerificationService jGoogleVerificationService ;
	
	public UserManager(EmailVerificationService emailVerificationService, FirstNameService firstNameService,
			LastNameService lastNameService, PasswordVerificationService passwordVerificationService, LoginService loginService,JGoogleVerificationService jGoogleVerificationService) {
		this.emailVerificationService = emailVerificationService;
		this.firstNameService = firstNameService;
		this.lastNameService = lastNameService;
		this.passwordVerificationService = passwordVerificationService;
		this.loginService=loginService;
		this.jGoogleVerificationService=jGoogleVerificationService;
	}


	@Override
	public boolean emailVerification(User user) {
		if (this.emailVerificationService.emailVerification(user)==true) {
			System.out.println("Email succesfully added.");
		return true; }
		else{System.out.println("Email format not acceptable.");
		return false;
		}
	}


	@Override
	public boolean firstNameAdd(User user) {
		this.firstNameService.firstNameAdd(user);
		return true;
	}


	@Override
	public boolean lastNameAdd(User user) {
		this.lastNameService.lastNameAdd(user);
		return true;
	}


	@Override
	public boolean passwordVerification(User user) {
		this.passwordVerificationService.passwordVerification(user);
		return true;
	}


	@Override
	public void register(User user) {
		this.loginService.login(user);
		
	}


	@Override
	public void verifyWithGoogle(User user) {
		this.jGoogleVerificationService.googleVerify(user);
		
	}
	
	
}

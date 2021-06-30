package core.concretes;

import core.abstracts.FirstNameService;
import entities.concretes.User;

public class FirstNameManager implements FirstNameService {

	@Override
	public boolean firstNameAdd(User user) {
		if(user.getFirstName().length()<=1 ) {
			System.out.println("First name must be minumum two character. ");
		} else {System.out.println("First name added succesfully. ");}
		
		return false;
	}
	
	

}

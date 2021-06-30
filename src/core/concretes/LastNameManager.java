package core.concretes;

import core.abstracts.LastNameService;
import entities.concretes.User;

public class LastNameManager implements LastNameService{

	@Override
	public boolean lastNameAdd(User user) {
		
		if (user.getLastName().length()<=1){System.out.println("Last name must be minumum two character."); 
		} else {System.out.println("Last name added succesfully. ");}
		
		
		return false;
	}
	
	

}

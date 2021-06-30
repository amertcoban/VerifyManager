package dataAccess.concretes;

import dataAccess.abstracts.UserDao;

public class HibernateUserDao implements UserDao {

	@Override
	public void add() {
		System.out.println("Hibernate ile eklendi. ");
		
	}
	
	
	
}

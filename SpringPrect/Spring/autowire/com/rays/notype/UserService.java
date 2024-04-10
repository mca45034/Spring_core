package com.rays.notype;

public class UserService {
	private UserDao userDeo;

	public void setUserDeo(UserDao userDeo) {
		this.userDeo = userDeo;
	}
	
	public void testAdd() {
		userDeo.add();
	}

}

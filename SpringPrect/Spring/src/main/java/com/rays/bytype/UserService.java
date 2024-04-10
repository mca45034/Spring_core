package com.rays.bytype;

public class UserService {
	private UserDeo userDeo;

	public void setUserDeo(UserDeo userDeo) {
		this.userDeo = userDeo;
	}
	public void add() {
		userDeo.add();
	}
	

}

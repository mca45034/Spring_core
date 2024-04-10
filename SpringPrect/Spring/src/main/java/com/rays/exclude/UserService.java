package com.rays.exclude;

public class UserService {
	private String name;

	public UserService(String name) {
		super();
		this.name = name;
	}
	public void geet() {
		System.out.println("hello "+ name);
	}

}

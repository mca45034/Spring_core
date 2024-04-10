package com.rays.bean;

public class EmployeBean {
	private String name;
	private String department;
	private String selary;
	public EmployeBean(String name, String department, String selary) {
		super();
		this.name = name;
		this.department = department;
		this.selary = selary;
	}
	@Override
	public String toString() {
		return "EmployeBean [name=" + name + ", department=" + department + ", selary=" + selary + "]";
	}
	
	

}

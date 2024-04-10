package com.rays.constuctor;

public class EmployeService {
	private Employe employe;

	public EmployeService(Employe employe) {
		super();
		this.employe = employe;
	}
	public void testPrint() {
		employe.print();
	}

}

package com.hyperion.training.basic;

public class Admin extends User {

	public String superUser = "adminSuper";
	public String dir;
	public int edad;
	
	public void getSuperAccess() {
		
	}	
	public void printSuperUser() {
		System.out.println(superUser);
	}
	public void generarId(int i) {
		superUser = this.superUser + i;
	}

	public String generarUserName() {
		generarId(2);
		return superUser+= getName() + superUser;
	}

}

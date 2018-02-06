package com.hyperion.training.basic;

public class Admin extends User {
	
	public String superUser ="Admin rocks!";

	public String calcularRol() {
		return "Este rol es superUser" + superUser;
	}

}

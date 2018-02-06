package com.hyperion.training.basic;

public class Support extends User {

	public int mgmId = 12;

	public String calcularRol() {
		mgmId *= 5;
		return "Mi rol es support " + mgmId;
	}
	
}

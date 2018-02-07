package com.hyperion.training.basic;

public class Support extends User {

	int supportId;
	public void printSupportId() {
		System.out.println(supportId);
	}
	public void generarId(int i) {
		supportId += i*4;
	}
	@Override
	public String generarUserName() {
		//llamar query bdd usando name
		//usar query result ....
		return "" +supportId;
	}
	
	

}

package com.hyperion.training.basic;

public class Test {

	public static void main(String...args) {
		Admin admin = new Admin();
		Admin admin2 = new Admin();
		
		admin.setName("a");
		admin.generarId(4);
		 
		 Support support = new Support();
		 support.generarId(4);
		 support.generarUserName();
		 
		 admin.printSuperUser();
		 support.printSupportId();
	}
}

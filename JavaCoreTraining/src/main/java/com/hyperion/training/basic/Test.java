package com.hyperion.training.basic;

public class Test {

	public static void main(String...args) {
		/*
		Admin admin = new Admin();
		Admin admin2 = new Admin();
		
		admin.setName("a");
		admin.generarId(4);
		 
		 Support support = new Support();
		 support.generarId(4);
		 support.generarUserName();
		 
		 admin.printSuperUser();
		 support.printSupportId();
		 */
		 
		 Cellphones phone1 = new Cellphones();
		 phone1.setId(1);
		 phone1.setBrand("Samsung");
		 phone1.setNumber("6182416578");
		 phone1.setOS("Android");
		 phone1.setSOVersion("6.0");
		 phone1.setPrice(5000.00);
		 phone1.printCellphone();
		 System.out.println(phone1.getBrand());
	}
}

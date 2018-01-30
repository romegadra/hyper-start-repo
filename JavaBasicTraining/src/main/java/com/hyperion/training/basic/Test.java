package com.hyperion.training.basic;

public class Test {
	
	public void testStatics() {
		BasicsObjects bo = new BasicsObjects();
		bo.name = "John";
		bo.lastName = "Doe";
		bo.print();
		
		BasicsObjects bo2 = new BasicsObjects();
		bo2.name = "Juan";
		bo2.lastName = "Sepa";
		bo2.print();
		
		bo.print();
	}
	
	public void testReferences() {
		
		BasicsObjects bo = new BasicsObjects();
		bo.name = "John";
		bo.lastName = "Doe";
		bo.print();
		
		BasicsObjects bo2 = bo;
		
		bo2.name = "Juan";
		bo.print();
		bo.print();
	}
	
	public static void main(String...args) {
		
		Guest guest = new Guest();
		guest.setName("Gloria");
		guest.setLastName("Martinez");
		guest.generateUserName();
		System.out.println(
			"El usuario " + 
			guest.getName()+ 
			" " +
			guest.getLastName()+
			" es: " + 
			guest.getUserName()
		);
		
		Guest guest2 = new Guest();
		//guest2.name = "Alberto";

		guest2.generateUserName();
		System.out.println("Segunda instancia1=>" + guest2.getUserName());
		
		guest = guest2;
		System.out.println("Segunda instancia2=>" + guest.getUserName());
		guest2 = guest;
		System.out.println("Segunda instancia3=>" + guest.getUserName());
		//t.testStatics();
		//t.testReferences();
	}
}

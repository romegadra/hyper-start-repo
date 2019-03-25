package com.hyperion.training.basic;

public class BasicsObjects {
	
	public String name;
	public static String lastName;
	
	public BasicsObjects() {
		
		name = "John";
		lastName = "Doe";
	}
	
	public void print() {
	    System.out.println("Name: " + name);
	    System.out.println("LastName: " + lastName);
	}

	public static void main(String[] argumentos) {
		new BasicsObjects().print();
		
    }
}

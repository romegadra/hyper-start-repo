package com.hyperion.training.basic;

public class BasicsObjects {
	
	public String name;
	public static String lastName;
	
	public BasicsObjects() {
		name = "John";
		lastName = "Doe1";
	}
	
	public void print() {
	    System.out.println("Nombre: " + name);
	    System.out.println("Apellido: " + lastName);
	}

	public static void main(String[] argumentos) {
		new BasicsObjects().print();
		
    }
}

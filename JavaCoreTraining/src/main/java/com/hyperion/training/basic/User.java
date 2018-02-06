package com.hyperion.training.basic;

public abstract class User {
	
	public String name = "Default";
	public String lastName = "No";
	public int id;
	
	public String devolverNombre() {
		return name;
	}
	public void printName() {
		System.out.println("usuario " +name);
	}
	
	public abstract String calcularRol();
	
}

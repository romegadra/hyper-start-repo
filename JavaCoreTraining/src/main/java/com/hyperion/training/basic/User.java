package com.hyperion.training.basic;

public abstract class User {
	
	private String name ="Adan";
	private String lastName = "Carrasco";
	private int id = 3;
	
	public void setName(String name) {
		System.out.println("variable local set name" + name);
		this.name = name;
	}
	public void test() {
		String s = "a";
		s = s;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public abstract void generarId(int i);
	
	public abstract String generarUserName();
	
	public String returnName() {
		return name;
	}


}

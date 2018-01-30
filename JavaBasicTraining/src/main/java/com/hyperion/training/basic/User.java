package com.hyperion.training.basic;

public class User {
	
	private String name ="default";
	private String lastName ="defaultLastName";
	private int id = 0;
	private String userName = "defaultUserName0";
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String devolverNombre() {	
		return name;
	}

	public void generateUserName() {
		userName = name + (id+1);
	}
	
	public String getUserName() {
		return userName;
	}

}

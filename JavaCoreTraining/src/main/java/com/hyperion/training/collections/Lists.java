package com.hyperion.training.collections;

import java.util.ArrayList;

public class Lists {

	String[] arrayStrings = new String[6];
	ArrayList<User> listaUsuarios = new ArrayList<User>();

	public void addUser(User user) {
		listaUsuarios.add(user);
	}
	
	public void isEmpty() {
		System.out.println("Size:" + listaUsuarios.size());
		System.out.println(listaUsuarios.isEmpty());
	}
	
	public void printList() {
		for(User user: listaUsuarios ) {
			System.out.println("Usuario " + user.name);
			System.out.println("Edad " + user.age);
		}
	}
	
	public static void main(String[] args) {
		Lists lists =  new Lists();
		
		User a = new User("Joel","Rodriguez","29");
		User b = new User("Vania","Medina","28");
		User c = new User("Juanito","Medina","78");
		lists.isEmpty();
		lists.addUser(a);
		lists.isEmpty();
		lists.addUser(b);
		lists.isEmpty();
		lists.addUser(c);
		lists.isEmpty();
		lists.printList();
	}
}



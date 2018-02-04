package com.hyperion.training.basic;

public class Test {

	public static void main(String...args) {
		
		User user = new Admin();
		System.out.println(">>>" + user.calcularRol());
		Admin admin = new Admin();
		admin.name = "Debora";
		admin.printName();
		System.out.println(admin.calcularRol());
		Support support = new Support();
		support.printName();
		System.out.println(support.calcularRol());
		SubAdmin subAdmin = new SubAdmin();
		subAdmin.printName();
		System.out.println(subAdmin.calcularRol());
		Admin a = subAdmin;
		User u2 = new SubAdmin();
		
		Object d = new Admin();
		
	}
}

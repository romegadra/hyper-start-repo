package com.hyperion.training.basic;

public class Test {

	public static void main(String...args) {
		/*System.out.println(Regular.getCounter());
		Regular.addCounter();
		System.out.println(Regular.getCounter());
		*/
		
		Movible m = new Balon();
		System.out.println(m.moverse());
		//Esferica e = new Balon();
		System.out.println(m.calcularCurva(5, 2));
		
		
		/*Admin admin = new Admin();
		
		if(admin instanceof User) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if(admin instanceof Object) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}*/
		
		
		Admin admin1 = new Admin();
		admin1.setName("Cesar");
		admin1.dir ="Casa de Cesar";
		admin1.edad =28;
		Admin admin2 = new Admin();
		admin2.setName("Saron");
		admin2.dir ="Casa de Cesar";
		admin2.edad =26;
		Admin admin3 = new Admin();
		admin3.setName("Debora");
		admin3.dir ="Casa de Vania";
		admin3.edad =5;
		System.out.println(admin1.getName());
		System.out.println(admin1.dir);
		System.out.println(admin1.edad);
		System.out.println(admin2.getName());
		System.out.println(admin2.dir);
		System.out.println(admin2.edad);
		System.out.println(admin3.getName());
		System.out.println(admin3.dir);
		System.out.println(admin3.edad);
		/*Admin admin2 = new Admin();
		*/	
		Movible m0 = new Balon();
		System.out.println(m0.moverse());
		System.out.println(m0.calcularCurva(3, 4));
		Admin admin = new Admin();
		if (admin instanceof User) {
			System.out.println("true");
		} else{
			System.out.println("false");
		}
		if (admin instanceof Object) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		
	}
}

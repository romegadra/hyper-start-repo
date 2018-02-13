package com.hyperion.training.basic;

public class Test {

	public static void main(String...args) {
		/*System.out.println(Regular.getCounter());
		Regular.addCounter();
		System.out.println(Regular.getCounter());
		*/	
		Movible m = new Balon();
		System.out.println(m.moverse());
		System.out.println(m.calcularCurva(3, 4));
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

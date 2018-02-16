package com.hyperion.training.basic;

public class Operations {
		
	public static void main(String...args) {
		
		/*
		 *
	 	 /
	 	 +
	 	 -
	 	 %
	 	 << >>
	 	 < mayor que
	 	 > menor que
	 	 <= menor o igual que
	 	 >= mayor o igual que
	 	 = asignacion
	 	 
	 	 == comparacion (igual a)
	 	 != comparacion (diferente de)
	 	 
	 	 Operadores Logicos:
	 	 && And &
	 	 || Or |
	 	 ! negacion !
	 	 
	 	 Objetos
	 	 instanceof
		 */
		int a = ((3+2) * 2 )*3;
		//((3+2) * 2 ) 10
		//(3+2) 5
		int i = 11;
		int j = 3;
		/*
		System.out.println(i/j);
		System.out.println(i%j);
		System.out.println(i = j);
		System.out.println(i != j);
		System.out.println(i > j);
		System.out.println(i < j);
		System.out.println(i >= j);
		System.out.println(i <= j);
		*/
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		System.out.println(!b1);
	}
}

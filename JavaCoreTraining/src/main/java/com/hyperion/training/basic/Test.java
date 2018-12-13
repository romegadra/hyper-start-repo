package com.hyperion.training.basic;

import java.util.Scanner;

import com.hyperion.training.data.structures.Arrays2;

public class Test {

	public static void main(String...args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(scan.next());
					// 0 1 2 3 
		int array[] = {1,2,3,4};
		int array2[] = new int[4];
	
		int rompeJvm = 0;
		for (int temp : array ) {
			//System.out.println("array: "+ temp);
		}
		
		do {
			//System.out.println("Do While " + rompeJvm);
		}while(rompeJvm < 0);
		
		while (rompeJvm < 0) {
			//System.out.println("While " + rompeJvm);
			rompeJvm++;
		}

		// for ( inializacion ; condicion ; expresion )
		for (int i = 0; i < 4; i++ ) {
			
			array2[i] = i+1;
			//System.out.println(array2[i]);
			if (array2[i] == 2) {
				break;
			}
		}
		
		for (int i = 0; i < 4; i++ ) {
			//System.out.println(array2[i]);			
		}
		
		
		
		
		//Controles de flujo
		
		int a = 15;
		int b = 15;
		boolean c = false;
		String result = "";
		c = (a > b) ? true : false;
		result = (a > b) ? "A es mayor" : ( 
				(a < b) ? "B es mayor" : "Son iguales" ) ;
		System.out.println("Resultado final: " + result);
		//Decision
		//Expresion que resuelva a un boleano
		if (a > b) {
			System.out.println("A es mayor");
		} else if (b > a) {
			System.out.println("B es mayor");
		} else {
			System.out.println("Seguro son iguales");
		}
		
		int opt = 1;
		String opt2 = "C7";
		switch (opt2) {
			case "C0": System.out.println("Opt 0");break;
			case "C1": System.out.println("Opt 1");break;
			case "C2": System.out.println("Opt 2");break;
			case "C3": System.out.println("Opt 3");break;
			default: System.out.println("No aplica ninguna opt");
		}
		System.out.println("After switch");
		
		
	}
}

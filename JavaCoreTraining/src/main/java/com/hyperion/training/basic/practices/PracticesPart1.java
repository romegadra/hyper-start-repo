package com.hyperion.training.basic.practices;

import java.util.Random;
import java.util.Scanner;

public class PracticesPart1 {

	public void checkPositiveNegative(int val) {
		if (val > 0 ) System.out.println("Es positivo");
		else {System.out.println("Es Negativo");}
	}
	
	public void tabla(int var) {
		for(int i =1; i <=10; i++) {
			System.out.println();
		}
	}
	
	//public - frontBack(- -) {
		/*Dado un string, devolver un nuevo string donde
		el primer caracter sea el ultimo del primer string, 
		y el ultimo caracter sea el primer del primer string
		code ==> eodc
		ab ==> ba
		*/ 
	//}
	
	public static void main(String[] args) {
		Random r = new Random();	
		
		System.out.println(r.nextInt((6-1)+1) + 1);
		System.out.println(r.nextInt((6-1)+1) + 1);
		System.out.println(r.nextInt((6-1)+1) + 1);
		System.out.println(r.nextInt((6-1)+1) + 1);
		System.out.println(r.nextInt((6-1)+1) + 1);
		System.out.println(r.nextInt((6-1)+1) + 1);
		PracticesPart1 variableRefP1 = new PracticesPart1();
		/*
		 1:Dado un numero X, el programa cheque si es		 
		   positivo o negativo,
		 2:Dado un numero x, crear un metodo que valide si 
		    x es par o non. 
		    / -> dividir
		    % -> residuo
		    var x = 1/2;
		    var x = 1%2;
		 3:Dado un numero x, siendo x > 0, 
		 	imrpimir su tabla de multiplicacion de 1 a 10 
		 	bonus: imprimir formato: NxN = N  
		 4: del rango de 1 a 100, imprimir solo los numeros
		 	divisibles por 3, 5
		 	bonus: divisble por 3, 5 y ambos 
		 5: sin usar StringBuffer o Stringbuilder 
		 	dado un String s, invertir el String
		 	0 1 2 3 4 5 6 <- indice
		 	v v a s d s a <- valor
		 	array[2] -> a
		 	array.length -> longitud del arreglo
		*/
		
		Scanner scanner = new Scanner(System.in);
		int var = scanner.nextInt();	
		scanner.close();
		variableRefP1.checkPositiveNegative(var);

	}

}

package com.hyperion.training.basic;

import java.util.Scanner;

/*
 * Metodos
 * argumentos (entrada - salida)
 * polimorfismo
 */


public class Methods {
	static int a = 0;
	private int result = 0;
	public final float PI = 3.1416f;
	//1 Modificador acceso
	//public protected private default
	
	// Non-access-modifiers
	//static final
	
	//2 valor de retorno
	//puede ser desde primitivo hasta objeto, solo 1 o void
	
	//3 nombre metodo comienza con un caracter [a-zA-Z]
	
	//4 argumento entrada puede ser ninguno() a x cantidad, cualquer tipo
	
	//5 Cuerpo del metodo entre llaves, define comportamiento del metodo
	// [1]public [2]void [3]metodo [4]() [5]{}	
	
	private int sumar(int x, int y) {	
		result = x + y;
		return result;
	}
	
	private int restar(int x, int y) {
		result = x - y;
		return result;
	}
	
	private int multiplicar(int x, int y) {
		result = x * y;
		return result;
	}
	
	public static void contar() {
		a++;
		System.out.println(a);
	}
	
	public void operacion(int opc, int x, int y) {
		int resultado = 0;
		switch(opc) {
			case 1: {
				resultado = this.sumar(x, y);
				break; }
			case 2: {
				resultado = restar(x, y);
				break; }
			case 3: {
				resultado = multiplicar(x, y);
				break; }
		}
		System.out.println(resultado);
	}
	
	
	public static void main(String...args) {
		Methods methods = new Methods();
		/*Scanner scann = new Scanner(System.in);
		
		System.out.println("Elije: 1 sumar, 2 restar, 3 multiplicar");
		int op = scann.nextInt();
		System.out.println("Inserta X");
		int x = scann.nextInt();
		System.out.println("Inserta Y");
		int y = scann.nextInt();	*/
		//1 sumar, 2 restar, 3 multiplicar		
		//methods.operacion(op, x, y);
		//scann.close();
		methods.contar();
		Methods methods2 = new Methods();
		
		Methods.contar();
		Methods.contar();		
		Methods methods3 = new Methods();
		Methods.contar();
	}
}

package com.hyperion.training.basic;

public class SubMethods2 extends Methods2 {

	public double dividir(double a, double b) {
		return (a/b)+1;
	}
	
	public double dividir(double a, int b) {
		return super.dividir(a, b);
		
	}
	
	public static void main(String[] args) {
		
		SubMethods2 m2 = new SubMethods2();
		System.out.println(m2.dividir(8, 3));
		
	}

}

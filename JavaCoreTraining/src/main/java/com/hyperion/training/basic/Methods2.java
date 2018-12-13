package com.hyperion.training.basic;

public class Methods2 {
	
	private int multiplicar(int x, int y) {
		return x * y;
		 
	}
	
	private double multiplicar(double x, double y) {
		return x * y;
		
	}
	
	private int multiplicar(int x, int y, int z) {
		return x*y*z;

	}
	
	private int multiplicar(int... a) {
		System.out.println("length>>>" + a.length);
		int var =1;
		for(int i = 0; i <= a.length-1; i++) {
			var = a[i]*var;
		}
		return var;

	}
	
	public double dividir(double a, double b) {
		return a/b;
	}
	
	public String toString() {
		return "Esta clase hace multiplicaciones";
	}
	
	public void test1(int x) {
		x = x*2;
		System.out.println("Metodo valor x=" + x);
	}
	
	public void test2(String s) {
		s = s + " otra cosa";
		System.out.println("Metodo2  valor s=" + s);
	}
	
	public void test3(Test1 t1) {
		t1.a = 12;	
		System.out.println("method>" + t1.a);
	}
	
	public static void main(String... args) {
		
		Methods2 m2= new Methods2();
		Test1 t1 = new Test1();
		m2.test3(t1);
		System.out.println(m2.multiplicar(1,4,5,6,7,8,9,3,5,5,4) );
		System.out.println(m2.multiplicar(1,4,5,6,7));
		System.out.println(m2.multiplicar(1) );
		
	}
}
class Test1 {
	int a = 0;
}
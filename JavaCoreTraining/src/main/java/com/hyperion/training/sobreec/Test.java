package com.hyperion.training.sobreec;

public class Test {

	public static void main (String [] args) {
		Celulares sam = new Samsung();
		System.out.println(sam.usar());
		
		Celulares ip1 = new Iphone();
		System.out.println(ip1.usar());
		Iphone ip2 = new Iphone();
		System.out.println(ip2.usar("¿ella me ama?"));
		System.out.println(ip2.usar(8,2));
	}
		
}

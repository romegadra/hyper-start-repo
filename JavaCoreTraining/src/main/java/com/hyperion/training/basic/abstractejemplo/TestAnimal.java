package com.hyperion.training.basic.abstractejemplo;

public class TestAnimal {

	public static void main(String...args) {
		
		Perro perro = new Perro();
		System.out.println(perro.run());
		System.out.println(perro.run(30));
		System.out.println(perro.speak());
		System.out.println(perro.speak("pequeño"));
		
		Animal pez = new Pez();
		System.out.println(pez.run());
	}

}

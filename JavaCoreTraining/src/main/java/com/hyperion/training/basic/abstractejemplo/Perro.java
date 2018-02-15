package com.hyperion.training.basic.abstractejemplo;

public class Perro extends Animal {

	public String run() {
		return "Corre como perro";
	}
	
	public String run(int velocidad) {
		return "corre a " + velocidad + " km/h";
	}
	public void run(int velocidad, int incrementar) {
		
	}
	public int run(int velocidad, int incrementar, String dato) {
		return velocidad * incrementar;
	}
	
	public String speak() {
		return "wafh";
	}
	
	public String speak(String raza) {
		if (raza == "pequeño" ) {
			return "ladrido agudo molesto";
		}
		return "WOOOFFFF WOOOOFFF";
	}


}

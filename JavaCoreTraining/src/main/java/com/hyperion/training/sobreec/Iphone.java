package com.hyperion.training.sobreec;

public class Iphone extends Celulares {

	
	public String usar() {
		return "Solo lo compre para tomar fotos...";
	}
	
	public boolean usar(String operacion) {
		return false;
	}
	
	public String usar(int x, int y) {
		return ""+x+" * "+y+" = "+(x*y);
	}
	
	public String llamar() {
		// TODO Auto-generated method stub
		return null;
	}

	
}

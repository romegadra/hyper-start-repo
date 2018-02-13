package com.hyperion.training.basic;

public class Balon implements Movible, Esferica{
	
	
	private String mensaje;
	
	public Balon() {}
	
	private String calcularRebote() {	
		return mensaje + " again!";
	}

	public void rebotar() {}
	
	public String moverse(){	
		return calcularRebote();
	}

	
	public int calcularCurva(int x, int y) {
		return 0;
	}
}

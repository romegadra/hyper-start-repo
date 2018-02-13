package com.hyperion.training.basic;


public class Balon implements Movible, Esferica{
	
	
	private String mensaje;
	
	public Balon() {}
	
	private String calcularRebote() {	
		return mensaje + " again!";
	}

	private int getDataFromWebService() {
		return 8*8;
	}
	
	public void rebotar() {	
	}

	public String moverse() {
		return calcularRebote();
	}

	public int calcularCurva(int x, int y) {
		return (getDataFromWebService()*x)*y;
	}


}

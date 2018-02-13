package com.hyperion.training.basic;

public class Balon implements Movible {
	
	private String mensaje;
	public Balon() {
		mensaje = "Rebotar!";
	}
	
	private String calcularRebote() {
		return mensaje+ "Again!";
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

package com.hyperion.training.basic;

public class Balon implements Movible {

	private String msj;
	
	public Balon() {
		msj = "rebotar!";
	}

	private String calcularRebote() {
		return msj+"Again!";
	}
	
	public void rebotar() {
		
	}
	
	private int getDataFromWebService() {
		return 8*8;
	}

	@Override
	public String moverse() {
		// TODO Auto-generated method stub
		return calcularRebote();
	}

	@Override
	public int calcularCurva(int x, int y) {
		// TODO Auto-generated method stub
		return (getDataFromWebService()*x)*y;
	}
	
}

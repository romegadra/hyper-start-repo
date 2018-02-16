package com.hyperion.training.basic.abstractejemplo;

public abstract class Animal implements AnimalInt{
	
	public String run() {
		return "corre generico";
	}
	
	public abstract String speak();
	
}

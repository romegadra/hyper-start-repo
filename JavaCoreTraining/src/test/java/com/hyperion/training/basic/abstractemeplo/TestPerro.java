package com.hyperion.training.basic.abstractemeplo;

import com.hyperion.training.basic.abstractejemplo.Perro;

import junit.framework.TestCase;

public class TestPerro extends TestCase {

	Perro perro;
	
	public void setUp() {
		perro = new Perro();
	}
	
	public void testPerroMetodos() {
		
		assertTrue(perro.run() != null);
		
	}
}

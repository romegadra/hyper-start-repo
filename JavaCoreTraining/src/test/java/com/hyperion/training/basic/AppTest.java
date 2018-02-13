package com.hyperion.training.basic;

import junit.framework.TestCase;

public class AppTest extends TestCase {
	
	private int a, b;
	public void setUp() {
		a = 1;
		b = 2;
	}
	
	public void testUser() {
		int value = a+b;
		assertTrue(value > 1);
	}
}

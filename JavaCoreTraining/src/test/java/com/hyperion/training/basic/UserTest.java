package com.hyperion.training.basic;

import junit.framework.TestCase;

public class UserTest extends TestCase{

	Admin admin;
	private int i;
	public void setUp() {
		admin = new Admin();
		i = 12;
	}
	public void testUser() {
		admin.generarId(i);
		assertTrue("Se genero el id", null!=admin.generarUserName());
		assertNotNull(admin.generarUserName());
	}
}

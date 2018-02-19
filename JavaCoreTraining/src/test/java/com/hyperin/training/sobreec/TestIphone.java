package com.hyperin.training.sobreec;

import com.hyperion.training.sobreec.Iphone;
//import com.hyperion.training.sobreec.Samsung;

import junit.framework.TestCase;

public class TestIphone extends TestCase {

	Iphone ip;
	//Samsung sam;
	
	public void setUp() {
		ip = new Iphone();
		//sam = new Samsung();
	}
	
	public void testIphoneMetodos() {
		//assertTrue(sam.usar() != null);
		assertTrue(ip.usar() != null);
	}

}

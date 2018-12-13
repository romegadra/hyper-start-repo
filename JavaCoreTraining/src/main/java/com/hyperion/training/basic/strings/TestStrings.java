package com.hyperion.training.basic.strings;

public class TestStrings {
	Strings s =  new Strings();
	
	public String parseTagString() {
		return s.makeOutWord("<<>>", "Palabras");
	}
	
	public static void main(String[] args) {
		TestStrings t = new TestStrings();
		System.out.println(t.parseTagString());


	}

}

package com.hyperion.training.basic.strings;


public class Strings {
	
	//makeOutWord("<<>>" ,"Word") --> <<Word>>
	//makeOutWord("[[]]" ,"Alpha") --> [[Alpha]]
	public String makeOutWord (String out, String word) {
		
		return new StringBuilder(out)
			.insert(2, word)
			.toString();
	}
	public String initialUpperCase(String input) {
		String[] temps = input.split(" ");
		String temp = "";
		for(int i = 0; i< temps.length; i++) {
			temp += temps[i].trim().replace(
					temps[i].trim().charAt(0), 
					Character.toUpperCase(
							temps[i].trim().charAt(0))
					)+ " ";
		}
		return temp;
	}
	
	
}

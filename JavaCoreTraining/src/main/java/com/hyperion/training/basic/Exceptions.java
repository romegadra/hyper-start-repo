package com.hyperion.training.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exceptions {
	
	private FileReader fr;
	private BufferedReader br;
	private FileWriter fw;
	private BufferedWriter bw;
	private final String fileLocation = "C:\\Users\\ro\\Desktop\\test files\\palabras.txt";
	private final String fileResults = "C:\\Users\\ro\\Desktop\\test files\\resultado.txt";
	private static final String vocales = "aeiou";
	private static final char[] vocales2 = {'a','e','i', 'o', 'u'};
	
	public void processWord(String word, BufferedWriter bw) {
		char temp[] = word.toCharArray();
		int count=0;
		for(int i = 0; i< temp.length; i++) { 
			if (vocales.indexOf(Character.toLowerCase(temp[i])) >= 0) count++;
		}
		try {
			bw.write(Integer.toString(count));
			bw.newLine();
		}catch(IOException e) {
			System.out.println("problemas escribiendo tu archivo, duhh "+ 
					e.fillInStackTrace());
		}catch(Exception e) {
			
		}
	}

	public void processDocument() {
		try {
			fr = new FileReader(fileLocation);
			fw = new FileWriter(fileResults);
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			String line = "";
			while ((line = br.readLine()) != null) {
				processWord(line, bw);
			}
			br.close();
			fr.close();
					
			bw.close();
			fw.close();
			
		}catch(IOException e) {
			System.out.println("problemas escribiendo tu archivo, duhh "+ 
					e.fillInStackTrace());
		} 
		catch(IllegalArgumentException e) {
			System.out.println("hubo un error en la transaccion de datos "+ 
					e.fillInStackTrace());
		}
		catch(Exception e) {
			System.out.println("Error en general no tengo idea que fue "+ 
					e.fillInStackTrace());
		}
	}
	
	public static void main(String...args) {
		/*
		  Dado un String donde str.length > 0, palabras.txt
		  1:devolver cuantas vocales tiene el String
		  2: Imprimir resultado en archivo. resultado.txt
		  3: si no hay vocales, Imprimir mensaje  
		 */
		new Exceptions().processDocument();
				
	}
}

/*
 	//private static final char[] vocales = {'a','e','i', 'o', 'u'};
	/*
	for(char c : vocales) {
	char t = Character.toLowerCase(temp[i]);
	if( t == c) count++;
}*/


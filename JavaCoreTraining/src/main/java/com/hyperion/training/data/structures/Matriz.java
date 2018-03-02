package com.hyperion.training.data.structures;

public class Matriz {
	
	
	public static void main(String[] args) {
	
		int m[][] = {
				{1,2}, // posicion 0 
				{4,5,6},	 // posicion 1
		    	{7,8,9,10}	 // posicion 2
		};
		int m2[][] = new int[3][4];
		int m3[][][] = {
				{
					{1,2}, // posicion 0 
					{4,5,6},	 // posicion 1
			    	{7,8,9,10}	 // posicion 2
			},
			{
				{3,1}, // posicion 0 
				{3,5,8},	 // posicion 1
		    	{1,8,4,10}	 // posicion 2
			}
		};
		
		System.out.println(">>" + m[0].length);
		System.out.println(">>" + m[1].length);
		System.out.println(">>" + m[2].length);
		
		for(int x = 0; x < m.length; x ++) {
			for(int y = 0; y < m[x].length; y++) {
				System.out.print(m[x][y] + " ");
			}System.out.println();
		}
		System.out.println("m3>>" + m3.length);
		System.out.println("m3==>>" + m3[1][0][0]);
		int aa [][] = m3[1];
		
		for(int x = 0; x < aa.length; x ++) {
			for(int y = 0; y < aa[x].length; y++) {
				System.out.print(aa[x][y] + "<<<");
			}System.out.println();
		}
		
		for(int z = 0; z < m3.length; z ++) { 
			for(int x = 0; x < m3[z].length; x ++) {
				for (int y = 0; y < m3[z][x].length ; y++) { 
					System.out.print("-->>" + m3[z][x][y]);
				}System.out.println();
			}
		}
		
	}

}

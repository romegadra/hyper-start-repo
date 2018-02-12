package com.hyperion.training.data.structures;

public class Arrays {

	public static void main(String...args) {
		
					  //0,1,2,3,4,5,6 	
		int array [] = {1,2,3,4,5,6,7};
		int i = 4;
		System.out.println(array.length);
		if (i < array.length) {
			System.out.println(array[i]);
		}
		
		int array2[] = new int[10];
		for (int j =0; j <array2.length; j++) {
			array2[j] = j;
		}
		
		for(int j: array2) {
			System.out.println(j);
		}
		/*
		System.out.println(array[0]);
		System.out.println(array[5]);
		System.out.println(array[7]);*/
		
		
	}

}

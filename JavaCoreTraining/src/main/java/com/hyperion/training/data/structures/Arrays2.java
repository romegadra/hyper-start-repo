package com.hyperion.training.data.structures;

import java.util.Arrays;

public class Arrays2 {

	public static void main(String...args) {
		
					  //0,1,2,3,4,5,6 	
		int array [] = {1,2,3,4,5,6,7};
		int arr2[] = new int[15]; 
		
		//Arrays.fill(arr2, 14);
		
		for(int i=0; i< arr2.length;i++) {
			arr2[i] += i;
		}
		for(int i: arr2) System.out.println("I>"+i);
		int index = Arrays.binarySearch(arr2, 5);
		
		System.out.println("index" + index);

	}

}

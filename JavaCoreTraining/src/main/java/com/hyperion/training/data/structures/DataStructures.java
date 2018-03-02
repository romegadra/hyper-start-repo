package com.hyperion.training.data.structures;

import com.hyperion.training.basic.*;

public class DataStructures {
	
	Support user = new Support();
	Balon balon  = new Balon();
	
	public static void main(String...args) {
		int j = 0;
		int[] s = new int[15];
		for(int i : s) {
			s[i] = j++;
			System.out.println(i);
		}
	}
}

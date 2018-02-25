package com.hyperion.training.data.structures;

import java.util.Comparator;

public class AgeComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Studient s1 = (Studient)o1;
		Studient s2 = (Studient)o2;
		
		if (s1.getAge() < s2.getAge()) return -1;
		if (s1.getAge() > s2.getAge()) return 1;
		return 0;
	}

}

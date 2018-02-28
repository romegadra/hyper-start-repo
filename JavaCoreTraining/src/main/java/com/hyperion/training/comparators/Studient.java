package com.hyperion.training.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Studient implements Comparable<Studient> {
	
	private String name;
	private int age; 
	private float grade;
	
	public Studient(String name, int age, float grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getGrade() {
		return grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}
	
	public String toString() {
		return "Name: " +getName() + 
				" Age: " +getAge() + 
				" Grade: "+ getGrade();
	}
	
	public boolean equals(Studient std) {
        if(this.getName().equals(std.getName()) &&
        	this.getGrade() == std.getGrade()) {
        	return true;
        }
        return false;
    }
	
	public int compareTo(Studient o) {
		// -1 <-- menor
		// 0  <-- igual
		// 1 <-- mayor
		if (this.age > o.age) return 1;
		else if (this.age < o.age) return -1;
		else return 0;
	}
	
	
	
	public static void main(String...args) {
		
		List<Studient> sList = new ArrayList<>();
		sList.add(new Studient("Dan", 18, 90.1f));
		sList.add(new Studient("John", 19, 72.3f));
		sList.add(new Studient("Juan", 17, 85.6f));
		sList.add(new Studient("Pedro", 20, 100f));
		sList.add(new Studient("Samuel", 18, 9.6f));
		//Collections.sort(sList);
		//Collections.sort(sList, new NameComparator());
		//Collections.sort(sList, new NameComparatorInverse());
		Collections.sort(sList, new NameComparatorByName());
		for(Studient s : sList) {
			System.out.println(s.toString());
		}
		System.out.println();
		Collections.sort(sList, new Comparator<Studient>() {
			@Override
			public int compare(Studient o1, Studient o2) {
				if (o1.getGrade() > o2.getGrade()) {
					return -1;
				}
				if (o1.getGrade() < o2.getGrade()) {
					return 1;
				}
				return 0;
			}
		});
		Collections.sort(sList,  (Comparator<Studient>)(s1, s2) ->{ 
				if (s1.getGrade() > s2.getGrade()) {
					return -1;
				}
				if (s1.getGrade() < s2.getGrade()) {
					return 1;
				}
				return 0;
		});
		
		for(Studient s : sList) {
			System.out.println(s.toString());
		}
		/*System.out.println(studient1.equals(studient2));
		System.out.println(datos.toString());
		System.out.println(datos = d1.toString());
		System.out.println(datos.toString());
		System.out.println(studient1.toString());*/
		
		/*System.out.println(datos.toString());
		System.out.println(datos2.toString());
		System.out.println(datos == datos2);
		System.out.println(datos.equals(datos2));*/
		//toString()
		//equals()
	}

}

class NameComparator implements Comparator<Studient> {

	@Override
	public int compare(Studient o1, Studient o2) {
		
		if (o1.getGrade() < o2.getGrade()) {
			return -1;
		}
		if (o1.getGrade() > o2.getGrade()) {
			return 1;
		}
		return 0;
	}
}

class NameComparatorByName implements Comparator<Studient> {

	@Override
	public int compare(Studient o1, Studient o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class NameComparatorInverse implements Comparator<Studient> {

	@Override
	public int compare(Studient o1, Studient o2) {
		if (o1.getGrade() > o2.getGrade()) {
			return -1;
		}
		if (o1.getGrade() < o2.getGrade()) {
			return 1;
		}
		return 0;
	}
}
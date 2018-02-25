package com.hyperion.training.data.structures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Studient {
	
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
		return getName() + " " + getAge() + " "+ getGrade();
	}
	
	public static void main(String...args) {
	
		List<Studient> sList = new ArrayList<>();
		sList.add(new Studient("Dan",18,(float)90.1));
		sList.add(new Studient("John",19,(float)72.3));
		sList.add(new Studient("Juan",17,(float)85.6));
		sList.add(new Studient("Pedro",16,(float)10.0));
		sList.add(new Studient("Samuel",18,(float)100));
		
		Collections.sort(sList, new  AgeComparator());
		Iterator l1 = sList.iterator();
		while(l1.hasNext()) {
			System.out.println(l1.next().toString());
		}
	}
	
	
}

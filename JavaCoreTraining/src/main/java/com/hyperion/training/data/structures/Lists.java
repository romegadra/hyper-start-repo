package com.hyperion.training.data.structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class Lists {
	
	List<String> list1  = new ArrayList<>();
	List<Integer> list2 = new ArrayList<>();
	List<String> list3  = new Vector<>();
	List<String> list5  = new LinkedList<>();
	Set<Integer> list4  = new HashSet<>();   
	Map<String,String> list6  = new HashMap<>();
	
	public void useList() {
		
		list6.put("version1", "1.0");
		list6.put("version2", "2.0");
		list6.put("version3", "3.5");
		
		System.out.println("map>>" + list6.get("version2"));
		System.out.println("map>>" + list6.get("version3"));
		
		Set<String> tempList = list6.keySet();
		
		for(String s: tempList) {
			//if(s.equals("version2")) {
				System.out.println("Val>>>>" + list6.get(s));//break;
			//}
		}
		
		for (int i = 0; i<10; i++) {
			list1.add("Data"+i);
			list2.add(i+1);
		}
		for(String s: list1) {
			System.out.println(s);
		}
		Iterator i = list2.iterator();
		Iterator i2 = list2.iterator();
		while(i.hasNext()) { 
			System.out.println(i.next());
			while(i2.hasNext()) { 
				int temp = (Integer)i2.next(); 
				if (temp%2 == 0) {
					System.out.println("inner:" + temp);
				}
			}
		}
		
		for(int i3 = 0; i3< 10; i3++) {
			list4.add(14);
		}
		for(Integer temp : list4) {
			System.out.println("Set:" + temp);
		}
		System.out.println(list4.size());
		
		
	}
	
	public static void main (String...args) {
		new Lists().useList();
	}
	
}

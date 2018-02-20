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
	
	List <String> list1 = new ArrayList<>();
	List <Integer> list2 = new ArrayList<>();
	List <String> list3 = new Vector<>();//igual que una lista, pero verifica que otro hilo(thread) no este usando sus metodos
	Set <Integer> list4 = new HashSet<>();//lista que permite tener elementos repetidos	
	List<Integer> list5 = new LinkedList<>();//Lista ligada que usa nodos
	Map<String,String> list6 = new HashMap<>();//mapas que contienen un KEY y un VALUE
	
	public void useList() 
	{	for(int i=0; i<10; i++)
		{	list1.add("Data"+i);
			list2.add(i+1);
			
			list6.put("version1","1.0");//agregar alemento
			list6.put("version2","2.0");
			list6.put("version3","3.5");
			
			System.out.println("map>> "+list6.get("version1"));
			System.out.println("map>> "+list6.get("version3"));
		}
		
		for(String s: list1) //ciclo for para iterar una lista
		{System.out.println(s);}
		
		Iterator i = list1.iterator();
		Iterator i2 = list2.iterator();
		
		while(i.hasNext())
		{	System.out.println(i.next());
			while(i2.hasNext()) 
			{	int temp = (Integer) i2.next();
				if(temp%2 == 0)	System.out.println("Inner: "+temp);
			}
		}
	}
	
	public static void main(String ... args)
	{	new Lists().useList();//objeto anonimo, solose crea temporalmente,se usa una vez y se destruye
	
	
	}

}

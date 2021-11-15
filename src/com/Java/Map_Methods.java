package com.Java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Methods {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		
// Put 
		m.put(1, "Java");
		m.put(2, "Welcome");
		m.put(3, "Hi");
		m.put(3, "Lenovo");
		m.put(null, "a");
		m.put(null, "b");
		m.put(4, "Lenovo");
		m.put(5, null);
		m.put(6, null);
		
		System.out.println(m);
		
// Size
		int size = m.size();
		System.out.println(size);
		
//Get
		String string = m.get(3);
		System.out.println(string);
		
//Key set - shows key value
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
// values
		Collection<String> values = m.values();
		System.out.println(values);
		
//ContainsKey 
		boolean containsKey = m.containsKey(8);
		System.out.println(containsKey);
		
//Contains Value
		boolean containsValue = m.containsValue("Lenovo");
		System.out.println(containsValue);
		
//Entry set
		
	Set<Entry<Integer, String>> entrySet = m.entrySet();
	for (Entry<Integer, String> entry : entrySet) {
		
	
	System.out.println(entry);
	

	}	
		
		
		
		
	}

}

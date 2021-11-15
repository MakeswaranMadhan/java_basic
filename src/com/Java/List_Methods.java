package com.Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Methods {
	public static void main(String[] args) {
		List<Object> l = new ArrayList<Object>();
// add 
		l.add(45);
		l.add(22);
		l.add(54);
		l.add('b');
		l.add(90.89);
		l.add(76);
		l.add("Madhan");
		
		System.out.println(l);
		
// size
		int size = l.size();
		System.out.println(size);
		
//Get
		Object object = l.get(4);
		System.out.println(object);
		
//Set
		Object set = l.set(2, "23");
		System.out.println(l);
		
//Remove
		Object remove = l.remove(5);
		System.out.println(l);
		
//indexOf
	    int indexOf = l.indexOf('b');
	    System.out.println(indexOf);
	    
//contains
	   boolean contains = l.contains(90.89);
	   System.out.println(contains);
	  
//clear
	 //  l.clear();
	 //  System.out.println(l);
	   
//AddAll
	  List<Integer> l1 = new ArrayList<Integer>();	
	   
	  l1.add(45);
	  l1.add(22);
	  l1.add(76);
	  l1.add(90);
	  
	 // l.addAll(l1);
	  // System.out.println(l);
	  
//retainAll
	 // l.retainAll(l1);
	 // System.out.println(l);
		
//removeAll
	  l.removeAll(l1);
	  System.out.println(l);
	  
//Sort
	 //ascending
	  Collections.sort(l1);
	 System.out.println(l1);
	 //descending
	 Collections.sort(l1,Collections.reverseOrder());
	 System.out.println(l1);
	 
//IsEmpty
	 boolean empty = l1.isEmpty();
	 System.out.println(empty);
		
//Equals
	 boolean equals = l1.equals(l);
		System.out.println(equals);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

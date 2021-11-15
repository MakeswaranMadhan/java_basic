package com.Java;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Set_collection {
	public static void main(String[] args) {
		Set<Object> l = new HashSet<Object>();

		// add
		l.add(23);
		l.add(11);
		l.add(45);
		l.add(87);

		l.addAll(l);
		System.out.println(l);

		// size
		int size = l.size();
		System.out.println(size);

		// get

		// set

		// remove
	//	l.remove(23);
	//	System.out.println(l);

		// IndexOf

		// Contains

		boolean contains = l.contains(11);
		System.out.println(contains);

		// clear

		 // l.clear();
		// System.out.println(l);

		Set<Integer> l1 = new HashSet<Integer>();

		l1.add(23);
		l1.add(14);
		l1.add(46);
		l1.add(87);
	// AddAll
		// l.addAll(l1);
		// System.out.println(l);

	// RetainAll
		//	l.retainAll(l1);
		//	System.out.println(l);
	
	// removeAll
		// l.removeAll(l1);
		// System.out.println(l);
		
	//Sort
		
	//IsEmpty
		boolean empty = l1.isEmpty();
		System.out.println(empty);
		
	//Equals
		boolean equals = l1.equals(l);
		System.out.println(equals);
		

	}

}

package com.Java;

public class String1 {
	public static void main(String[] args) {
		String s = "My Name is Madhan";
		
	// 1 s.length - string length
		
		int length = s.length();
		System.out.println(length);
	
	// 2 s.equals - check whether the condition is true r false
		
		boolean equals = s.equals("My Name is Madhan");
		System.out.println(equals);
		
	// 3 s.equalsIgnoreCase - Ignore case - accept caps & small
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase("my name is madhan");
		System.out.println(equalsIgnoreCase);
		
	// 4 s.touppercase - to return upper case
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
	// 5 s.tolowercase - to return lower case
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
	
	// 6 s.startswith - check if the string starts with given prefix
		
		boolean startsWith = s.startsWith("M");
		System.out.println(startsWith);
		
		
	//7 s.endswith - check this string ends with given suffix
		
		boolean endsWith = s.endsWith("n");
		System.out.println(endsWith);

	// 8 s.contains - method searches the sequence of character in this string
		
		boolean contains = s.contains("z");
		System.out.println(contains);
		
	// 9 s.indexOf -value-method returns index of given character value or substring
		
		int indexOf = s.indexOf("n");
		System.out.println(indexOf);
		
	// 10 s.lastindexOf -value-returns last index of given character value or substring
		
		int lastIndexOf = s.lastIndexOf("a");
		System.out.println(lastIndexOf);
		
	// 11 s.charAt - index - returns a Char value at the given index number
		
		char charAt = s.charAt(13);
		System.out.println(charAt);
		
	// 12 s.replace - return a string replacing all the old Char or Char sequence to new Char
	//                or Char Sequence.
		
		String replace = s.replace("is" ,"of" );
		System.out.println(replace);
		
	// 13 s.substring - remove a string or Char
		
		String substring = s.substring(7);
		System.out.println(substring);
		
	// 14 s.Isempty - check whether the string is empty or not
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
	// 15 s.split - split the word
		
		String[] split = s.split("i");
		for (String string : split) {
			System.out.println(string);
		}
		
	// 16 s.trim - remove unwanted space
		String a = "   madhan    ";
		String trim = a.trim();
		System.out.println(trim);
		
	// 17 s.concat - combine the two values
		 
		String concat = s.concat(a);
		System.out.println(concat);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

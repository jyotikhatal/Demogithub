package com.practice;


import java.util.LinkedHashSet;

import java.util.Set;

public class LinkedHashSetTest{

	public static void main(String[] args) {
		Set s = new LinkedHashSet();
		s.add("1");
		s.add(1);
		s.add(2);
		s.add(3);
		System.out.println(s);
		/*for (Object o : s) {
			System.out.println(o);
			
		}
*/	}

}

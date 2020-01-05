package com.nt;

import java.util.Comparator;

import java.util.TreeSet;

public class TreeSett {

	public static void main(String[] args) {
		TreeSet s=new TreeSet(new MyComparator());
		s.add(10);
		s.add(0);
		s.add(15);
		s.add(20);
		s.add(20);
		System.out.println(s);
	}

}
  

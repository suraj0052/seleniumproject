package Sett;

import java.util.HashSet;

public class Hashsett {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(123);
		hs.add("hello");
		hs.add("hello");
		hs.add(345);
		hs.add(123);
		hs.add(0);
		hs.add(null);
    System.out.println(hs);
    System.out.println(hs.remove(345));
    System.out.println(hs);
    System.out.println(hs.size());
   
	}

}

package ArayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Swa {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("mm");
		al.add("ma");
		al.add("nnn");
	Iterator<String> it=al.iterator();
	while(it.hasNext())
	{
		String s=it.next();
		if(s.equals("mm"))
		
			it.remove();
		}
		System.out.println(al);
	}
		
		
	
	
	}



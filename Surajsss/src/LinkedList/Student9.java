package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Student9 {

	public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add("Ajay");
	l.add("Sanjay");
	l.add("vijay");
	System.out.println(l);
	ListIterator li=l.listIterator();
	while(li.hasNext())
	{
		String s1=(String)li.next();
		if(s1.equals("Sanjay"))
		{
			li.set("Sujay");
	    }
		System.out.println(l);
	}

	}

	
}

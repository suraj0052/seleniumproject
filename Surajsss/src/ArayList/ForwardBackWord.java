package ArayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ForwardBackWord {

	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add("suraj");
	al.add("subrat");
	al.add("samir");
	ListIterator lis=al.listIterator();
	while(lis.hasNext())
	{
		String s=(String) lis.next();
		if(s.equals("suraj"))
			lis.remove();

	}
	System.out.println(al);
	while(lis.hasPrevious())
	{
		String s=(String)lis.previous();
		System.out.println(s);
	}

	}

}

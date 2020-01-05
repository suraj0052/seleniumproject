package ArayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Bookremove {

	public static void main(String[] args) {
		ArrayList<Book>Books=new ArrayList<Book>();
		Books.add(new Book(111,"java","suraj"));
		Books.add(new Book(113,"c","subrat"));
		Books.add(new Book(115,"pyth","samir")); 
		
		Iterator<Book> itr=Books.iterator();
		while(itr.hasNext())
		{
			Book b=itr.next();
			if(b.id==111)
			itr.remove();
			if (b.name.equals("pyth"))
				itr.remove();
		
		
		}
		for(Book aa:Books)
		{
			System.out.println(aa.id+" "+aa.name+" "+aa.author);
		}
		
	}

}

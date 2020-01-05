package Iterator;

//import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Iteratorr {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		for(int i=1;i<=10;i++)
		{
			l.add(i);
		}
		System.out.println(l);
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			Integer i=(Integer)it.next();
			if(i%2==0)
			{
				System.out.println(i);
			}
		}

	}

}

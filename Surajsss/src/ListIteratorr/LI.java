package ListIteratorr;

import java.util.LinkedList;
import java.util.ListIterator;

public class LI {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("suraj");
		ll.add("amiya");
		ll.add("raja");
		ll.add("mamu");
		ll.add("jana");
		//System.out.println(ll);
		ListIterator lit=ll.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
			/*if(st.equals("mamu"))
			{
				lit.add("raja1");
			}
			System.out.println(ll);*/
		}
	}

}

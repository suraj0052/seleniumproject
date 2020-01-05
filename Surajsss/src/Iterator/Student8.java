package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Student8 {

	public static void main(String[] args) {
	ArrayList l=new ArrayList();
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
	else
	{
		it.remove();
	}
	System.out.println(l);
}
	}

}

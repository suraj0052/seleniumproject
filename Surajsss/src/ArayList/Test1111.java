package ArayList;

import java.util.ArrayList;

public class Test1111 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(new Emp(111,"suraj"));
		a.add(new Student(222,"subrat"));
		a.add("ratan");
		a.add(10);
		a.add((null));
		System.out.println(a);
		for(Object o:a)
		{
			if(o instanceof Emp)
			{
				Emp e=(Emp)o;
				
				System.out.println(e.eid+" "+e.ename);
			}
			if(o instanceof Student)
			{
				Student s=(Student)o;
				System.out.println(s.eid+" "+s.ename);
			} 
			if(o instanceof Integer)
			{
	
				System.out.println(o);
			}
			if(o==null)
			{
				 System.out.println(o);
			}
		}

	}

}

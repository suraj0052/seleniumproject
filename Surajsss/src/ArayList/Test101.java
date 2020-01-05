package ArayList;

import java.util.ArrayList;

public class Test101 {

	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(new Emp(111,"suraj"));
	al.add(new Student(1,"subrat"));
	Student s=(Student)al.get(1);
	System.out.println(s.eid+" "+s.ename);
	
	
	Object o=al.get(0);
	if(o instanceof Student)
	{
		Student s1=(Student)o;
		System.out.println(s1.eid+" "+s1.ename);
	}
	if(o instanceof Emp)
	{
		Emp e=(Emp)o;
		System.out.println(e.eid+" "+e.ename);
		
	}
	
	}

}

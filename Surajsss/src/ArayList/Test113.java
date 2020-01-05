package ArayList;

import java.util.ArrayList;

public class Test113 {

	public static void main(String[] args) {
		ArrayList<Emp> al=new ArrayList<Emp>();
		al.add(new Emp(101,"suraj"));
		al.add(new Emp(121,"xxli"));
		al.add(new Emp(131,"mnnn"));
		//al.add(null);
		//al.add("tanar");
		//Student s1=(Student)al.get(1);
		//System.out.println(s1.eid+" "+s1.ename);
		// Object o=al.get(3);
		// if(o instanceof Emp)
		for(Emp e:al)
		 {
			// Emp e=(Emp)o;
			 System.out.println(e.eid+" "+e.ename);
		 }
		Emp e=al.get(1);
		 System.out.println(e.eid+" "+e.ename);
		/* if(o instanceof Student)
		 {
			 Student s=(Student)o;
			 System.out.println(s.eid+" "+s.ename);
		 }
		 if(o==null) 
		 {
			 System.out.println(o);
		 }*/
	}

}

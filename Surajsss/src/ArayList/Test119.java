package ArayList;

import java.util.ArrayList;

public class Test119 {

	public static void main(String[] args) {
		
		Emp e1=new Emp(101,"suraj");
		Emp e2= new Emp(121,"xxli");
		Emp e3=new Emp(131,"mnnn");
		
		ArrayList<Emp> al=new ArrayList<Emp>();
		al.add(e1);
		al.add(e2);
		ArrayList<Emp> a2=new ArrayList<Emp>();
		a2.addAll(al);
		a2.add(e3);
		System.out.println(a2.contains(e1));
		System.out.println(a2.containsAll(al));
	    System.out.println(a2.remove(e1));
		System.out.println(a2.contains(e1));
		System.out.println(a2.containsAll(al));
		a2.remove(al);
	     a2.retainAll(al);
		

		for(Emp ee:a2)
		{
			
		
		System.out.println(ee.eid+" "+ee.ename);
		
		
	
	}


	}

}

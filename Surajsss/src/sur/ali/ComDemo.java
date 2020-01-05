package sur.ali;

import java.util.TreeSet;

public class ComDemo {

	public static void main(String[] args) {
		Employee e1=new Employee("nag",100);
		Employee e2=new Employee("suraj",200);
		Employee e3=new Employee("mamu",300);
		Employee e4=new Employee("papi",400);
		Employee e5=new Employee("temu",500);
		Employee e6=new Employee("nag",600);
	  /* TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		System.out.println(t);*/
		TreeSet t1=new TreeSet(new comm2());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		t1.add(e6);
		System.out.println(t1);
		
	}

}

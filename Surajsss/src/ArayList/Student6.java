package ArayList;

import java.util.ArrayList;

public class Student6 {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(123);
		l.add("hello");
		l.add(null);
		l.add(true);
		l.add("helo");
		l.add(12.456);
		l.add(null);
		System.out.println(l);
		System.out.println(l.get(5));
		System.out.println(l.remove(5));
		System.out.println(l);
		System.out.println(l.set(5,'z'));
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		System.out.println(l.contains(12.456));
		System.out.println(l.indexOf('z'));
		System.out.println(l.lastIndexOf("helo"));
	}

}

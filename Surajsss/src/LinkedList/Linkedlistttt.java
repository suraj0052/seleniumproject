package LinkedList;

import java.util.LinkedList;
import java.util.Stack;

public class Linkedlistttt {

	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.push(10);
		s1.push(10);
		s1.push("suraj");
		s1.push(null);
		s1.push("suraj");
		/*li.add(null);
		li.add(true);
		li.add(20.23);
		li.add(10.23);
		li.add(true);
		li.add(20.23);
		li.add(10.23);
		li.add("heloo");*/
		System.out.println(s1.pop());
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1.search("suraj"));
		System.out.println(s1);
	}

}

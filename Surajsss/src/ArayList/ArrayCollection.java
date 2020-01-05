package ArayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayCollection {

	public static void main(String[] args) {
		String[]s={"suraj","amir","aliva"};
		ArrayList<String>al=new ArrayList<String>(Arrays.asList(s));
		al.add("mm");
		al.add("ma");
		System.out.println(al);
		//collection to array
		ArrayList<String>a2=new ArrayList<String>();
		a2.add("xx");
		a2.add("yy");
		String[]s1=new String[a2.size()];
		a2.toArray(s1);
		System.out.println(a2);
		for(String s3:s1)
		{
			System.out.println(s3);
		}
		//normal collection to array
		ArrayList a3=new ArrayList();
		a3.add("xa");
		a3.add(10);
		Object[] o=a3.toArray();
		for(Object oo:o)
		{
			System.out.println(oo);
		}
		
	
	}

}

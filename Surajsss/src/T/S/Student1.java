package T.S;

public class Student1 {


	public static void main(String[] args) {
	Student1 s=new Student1();
	String s2=new String("heelo");
	System.out.println(s2);
	System.out.println("output from toString");
	System.out.println(s.toString());
	System.out.println("output from object ref");
	System.out.println(s);
		String s1=new String("banglore");
		System.out.println(s1.length());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.startsWith("bang"));
		System.out.println(s1.endsWith("ore"));
		System.out.println(s1.charAt(3));
		System.out.println(s1.replace("ban", "sur"));
		System.out.println(s1.compareTo("bangloree"));
		String s3 ="have a nice a day";
		String [] split=s3.split(" ");
		for(String s4:split)
		{
			System.out.println(s4);
		}
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2,6));
	}

}

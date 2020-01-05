package T.S;

public class Student {
	String name;
	Student(String name)
	{
		this.name=name;
	}

	public static void main(String[] args) {
	Student s1=new Student("Suraj");
	System.out.println(s1);
	Student s2=new Student ("gyana");
	System.out.println(s2);

	}
	public String toString() {
		return name;
	}

	}



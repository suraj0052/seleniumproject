package T.S;

public class Student4 {
	String name;
	
	Student4(String name)
	{
		this.name=name;
		
	}
	

		public static void main(String[] args) {
		Student4 s=new Student4("suraj");
		System.out.println(s);
		System.out.println(s.hashCode());
		Student4 s1=new Student4("amit");
		System.out.println(s1);
		System.out.println(s1.hashCode());
		Student4 s2=new Student4("gyana");
		System.out.println(s2);
		System.out.println(s2.hashCode());

		}
		@Override
		public String toString()
		{
			return name;
		}
		public int hashCode()
		{
			return 101;
		}

	

	}



package T.S;

public class Student3 {
	String name;
	int rollnum;
	Student3(String name,int rollnum)
	{
		this.name=name;
		this.rollnum=rollnum;
	}

	public static void main(String[] args) {
	Student3 s=new Student3("suraj",101);
	System.out.println(s);
	System.out.println(s.hashCode());
	Student3 s1=new Student3("amit",102);
	System.out.println(s1);
	System.out.println(s1.hashCode());
	Student3 s2=new Student3("gyana",103);
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
		return rollnum;
	}

}

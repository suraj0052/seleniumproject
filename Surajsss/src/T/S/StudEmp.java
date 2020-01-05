package T.S;

public class StudEmp {
	int eid;
	String ename;
	StudEmp(int eid,String ename)
	{
		this.eid=eid;
		this.ename=ename;
	}

	@Override
	public String toString() {
		return "empid:" + eid + " ename:" + ename ;
	}

	public static void main(String[] args) {
		StudEmp t1=new StudEmp(111,"suaj");
		System.out.println(t1);
		System.out.println(t1.toString());
		String s1="suraj";
		String s2="sura";
		String s3="surajx";
		System.out.println(s1.compareTo(s2));
		System.out.println("suraj".equalsIgnoreCase("SURAJ"));
		System.out.println(s3.equals(s1));
		String s5="aliva";
		StringBuffer sb=new StringBuffer(s5);
		System.out.println(sb.reverse());
		StringBuffer sb2=new StringBuffer("suraj i love uuu");
		String s6=sb2.toString();
		System.out.println(s6);
		String s7="xx nn hhh  kjj mkkk";
		String[] s8=s7.split(" ");
		for(String  ss:s8)
		{
			System.out.println(ss);
		}
		
		
		
	}

			

}

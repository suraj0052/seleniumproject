package Array;

public class Student11 {

	public static void main(String[] args) {
		Emp e1=new Emp("rfefd", 12);
		Emp e2=new Emp("vbcbv", 121);
		Emp e3=new Emp("fsd", 23);
		
	Emp[] e=new Emp[5];
	
	e[0]=e1;
	e[1]=e2;
	e[2]=e3;
	//for(Emp s1:e)
	/*for(int i=0;i<e.length;i++)
	{
		if (e[i]==null)
		System.out.println(i);
	}*/
	for(Emp er:e)
	{
		System.out.println(er);
	}
	}

}

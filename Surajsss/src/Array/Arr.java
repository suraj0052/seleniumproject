package Array;

public class Arr {

	public static void main(String[] args) {
	int[]x=new int[5];
	x[0] =10;
	x[1]=20;
	x[2]=30;
	x[3]=40;
	x[4]=50;
	System.out.println(x[0]);
	System.out.println(x[2]);
	System.out.println("size or length of array is:"+ x.length);
	for(int i=0;i< x.length;i++)
	{
		System.out.println(x[i]);
	}
	System.out.println("==========");
	for(int i:x)
	{
		System.out.println(i);
	}
	

	}

}

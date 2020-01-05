package Array;

public class Jagged1 {

	public static void main(String[] args) {
	int[][]x=new int[3][];
	int[]x1={10,20,30};
	int[]x2={40,50,60};
	int[]x3={70,80,90};
	x[0]=x1;
	x[1]=x2;
	x[2]=x3;
	for(int[]i:x)
	{
		for(int y:i)
		{
			System.out.print(y+"---->");
		}
		System.out.println();
	}
	}

}

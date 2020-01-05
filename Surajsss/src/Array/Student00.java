package Array;

public class Student00 {

	public static void main(String[] args) {
	int[]x1={1,2,3};
	int[]x2={3,4,5};
	int[]x3={6,7};
	int[][]x4={x1,x2,x3};
	for(int []i:x4)
	{
		for(int y:i)
		{
			System.out.print(y+" ");
		}
		System.out.println();
	}

	}

}

package Array;

public class arrr1 {

	public static void main(String[] args) {
	int[][]i=new int[3][4];
	i[0][1]=10;
	i[2][2]=20;
	i[1][3]=30;
	for(int[] x:i)
	{
		for(int y:x)
		{
			System.out.print(y+" ");
		}
		System.out.println();
	}

	}

}

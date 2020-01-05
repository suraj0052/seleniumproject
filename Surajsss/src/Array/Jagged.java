package Array;

public class Jagged {

	public static void main(String[] args) {
		int[]x={10,20,30,40};
		int[]x1={12,22,33,44};
		int[]x2={30,24,35};
		int[]x3={10,30,40};
		int[][] x4={x,x1,x2,x3};
		for(int[]y:x4)
		{
			for(int z:y)
			{
				System.out.print(z+"  ");
			}
			System.out.println();
		}
	}

}

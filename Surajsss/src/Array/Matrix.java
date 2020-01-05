package Array;

public class Matrix {

	public static void main(String[] args) {
		int[][] i=new int[3][4];
		i[0][0]=10;
		i[1][2]=20;
		i[2][1]=30;
		

		System.out.println(i[1][2]);
		for(int[] x:i)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
//System.out.println("length of array:"+i.length);
		/*System.out.println(i[2][1]);
		for(String []x:i)
		{
			for(String y:x)
			{
				System.out.print(y+"");
			}
			System.out.println();
			//System.out.println("length of the array:"+i.length);
		}
		System.out.println("length of the array:"+i.length);*/
	}

}

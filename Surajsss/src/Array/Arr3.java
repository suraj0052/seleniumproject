package Array;

import java.util.Scanner;

public class Arr3{

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter a size for array:");
    int size =scan.nextInt();
    int[]x=new int[size];
    System.out.println("enter element into array:");
    for(int i=0;i<size;i++)
    {
    	x[i]=scan.nextInt();
    }
    System.out.println("elements present inside array:");

    for(int i:x)
    {
    	System.out.println(i);
    }
	}

}

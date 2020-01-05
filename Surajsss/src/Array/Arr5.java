package Array;

import java.util.Scanner;

public class Arr5 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter size of array:");
	int size=scan.nextInt();
	String[]x=new String[size];
	System.out.println("enter elements into array:");
	for(int i=0;i<size;i++)
	{
		x[i]=scan.next();
	}
	System.out.println("elements present inside array:");
	for(String i:x)
	{
		System.out.println(i);
	}
	

	}

}

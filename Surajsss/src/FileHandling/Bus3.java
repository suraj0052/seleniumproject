package FileHandling;

import java.io.File;
//fetch how many items in directory

public class Bus3 {

	public static void main(String[] args) {
	File f=new File("D:\\xyz\\suraj");
	System.out.println(f.exists());
	String list[]=f.list();
	int count=0;
	for(String s:list)
	{
		System.out.println(s);
		count++;
	}
System.out.println("total files present:"+count);
	}

}

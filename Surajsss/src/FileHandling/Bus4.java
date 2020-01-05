package FileHandling;

import java.io.File;
//to checkno of items ,file, & folder

public class Bus4 {

	public static void main(String[] args) {
	File f=new File("D:\\xyz\\suraj");
	System.out.println(f.exists());
	String list[]=f.list();
	int count=0;
	int file=0;
	int dir=0;
	for(String s:list)
	{
		File f1=new File(f,s);
		if(f1.isFile())
		{
			file++;
		}
		else if(f1.isDirectory())
		{
		
			dir++;
		}
		System.out.println(s);
		count++;
	}
	System.out.println("total item present:"+count);
	System.out.println("total file present:"+file);
	System.out.println("total dir present:"+dir);
	}

}

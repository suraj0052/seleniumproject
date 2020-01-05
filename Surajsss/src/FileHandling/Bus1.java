package FileHandling;

import java.io.File;

public class Bus1 {

	public static void main(String[] args) {
	File f4=new File("D:\\xyz\\Surajsss\\FilesFolder");
	System.out.println(f4.exists());
	String list[]=f4.list();
	int count=0;
	for(String s:list)
	{
		System.out.println(s);
		count++;
	}
	System.out.println("total files present:"+count);

	}

}

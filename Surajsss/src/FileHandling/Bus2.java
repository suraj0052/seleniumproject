package FileHandling;

import java.io.File;

public class Bus2 {

	public static void main(String[] args) {
   File f5=new File("D:\\xyz\\.metadata");
   System.out.println(f5.exists());
   String list[]=f5.list();
   int count=0;
   for(String s:list)
   {
	   System.out.println(s);
	   count++;
   }
   System.out.println("total file present:"+count);
   
   

	}

}

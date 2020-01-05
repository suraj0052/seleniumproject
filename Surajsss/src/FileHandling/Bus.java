package FileHandling;

import java.io.File;
import java.io.IOException;

//another ways to create folder/file
public class Bus {

	public static void main(String[] args) throws IOException {
	File f2=new File("FilesFolder7");
	System.out.println(f2.exists());
	f2.mkdir();
	File f3=new File(f2,"xyz1.txt");
	f3.createNewFile();
	System.out.println(f3.exists());
	}

}

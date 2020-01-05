package FileHandling;

import java.io.File;
import java.io.IOException;

//how to create file inside directory
public class Truck3 {

	public static void main(String[] args) throws IOException {
	File f1=new File("FilesFolder9","fgy.txt");
	System.out.println(f1.exists());
	f1.mkdir();
	System.out.println(f1.exists());
	

	}

}

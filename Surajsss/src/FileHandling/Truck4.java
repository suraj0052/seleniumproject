package FileHandling;

import java.io.File;
import java.io.IOException;

public class Truck4 {

	public static void main(String[] args) throws IOException {
	File f=new File("mno.txt");
	System.out.println(f.exists());
	f.createNewFile();
System.out.println(f.exists());
System.out.println(f.length());
	}

}

package FileHandling;

import java.io.File;

//how to creat directory
public class Truck2 {

	public static void main(String[] args) {
	File f=new File("FilesFolder9");
	System.out.println(f.exists());
	f.mkdir();
	System.out.println(f.exists());

	}

}

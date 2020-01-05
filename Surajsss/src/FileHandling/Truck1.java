package FileHandling;
//how to creat file
import java.io.File;
import java.io.IOException;

public class Truck1 {

	public static void main(String[] args) throws IOException {
	File t=new File("abc.txt2");
	System.out.println(t.exists());
	t.createNewFile();
	System.out.println(t.exists());

	}

}

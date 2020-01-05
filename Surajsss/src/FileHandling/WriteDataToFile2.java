package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToFile2 {

	public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("mno.txt");
	fw.write("hello All");
	fw.write("\r\n");
	char[]ch={'h','i'};
	fw.write(ch);
	fw.write("\r\n");
	fw.write(65);
	fw.write("\r\n");
	fw.flush();
	fw.close();
	System.out.println("pass");
	}

}

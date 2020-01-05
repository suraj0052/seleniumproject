package FileHandling;
//write a data into the file
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToFile {

	public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("mno.txt");
	fw.write("sdfghj");
	fw.flush();
	fw.close();
	System.out.println("pass");

	}

}

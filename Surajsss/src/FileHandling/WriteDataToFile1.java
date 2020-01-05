package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.filechooser.FileFilter;

public class WriteDataToFile1 {

	public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("mno.txt",true);
	fw.write("hello janu");
	fw.write("i love u");
	fw.flush();
	fw.close();
	System.out.println("pass");

	}

}

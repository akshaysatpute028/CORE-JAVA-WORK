package IO;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
//wap to ask name of a file from user and store file data to character array

public class ExampleTwo {

	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("File name : ");
		String name=s.next();
		
		File i=new File(name);
		
		FileReader f=new FileReader(name);
		char c[]=new char[(int) i.length()];
		
		f.read(c);
		System.out.print(c);
		
		f.close();
	}
}

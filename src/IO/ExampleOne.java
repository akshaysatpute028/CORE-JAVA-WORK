package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExampleOne {

	public static void main(String[] args) throws Exception{
		FileInputStream f= new FileInputStream("Hello.txt");
		int c;
		do{
			c=f.read();
			System.out.print((char)c);
		}while(c!=-1);
		f.close();
	}
}

package IO;

import java.io.*;

public class IOLabOne {

	public static void main(String[] args) throws Exception {

		File i=new File("Name.txt");
		FileInputStream f=new FileInputStream("Name.txt");
		int c;
		 do{
			 c=f.read();
			System.out.print((char)c);
		}while(c!=-1);
		 f.close();

	}

}

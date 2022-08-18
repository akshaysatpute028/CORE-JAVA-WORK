package IO;

import java.io.*;

//wap to ask filename from command line argument and store file data to Byte Array
public class FileToByteArray {

	public static void main(String[] args) throws Exception    //CLA Hello.txt
	{
		 FileInputStream f= new FileInputStream(args[0]);
		 
		 File f1= new File(args[0]);
		 
		 
		 int len= (int)f1.length();
		 
		 byte b[]= new byte[len]; // integer
		 
		 f.read(b);
		 for(int i=0;i<b.length;i++)

				 System.out.print((char) b[i]);
	}

}  
 

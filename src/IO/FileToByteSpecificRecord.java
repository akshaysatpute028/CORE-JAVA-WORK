package IO;

import java.io.*;

//wap to store first 10 characters from file to byte array 

public class FileToByteSpecificRecord {

	public static void main(String[] args) throws Exception 
	{
		 FileInputStream f= new FileInputStream("Hello.txt");  
		 
		 byte b[]= new byte[100]; // integer
		 //f.read( arrayname , start position , no of characters)
		 //below line will read first three characters from file and store it in b array at 10 position 
		 
		 
		 f.read(b,10,5);//read file data and store it to byte array 
		 
		 
		 for(int i=10;i<15;i++)

				 System.out.print((char) b[i]);
		 

	}

}
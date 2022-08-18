package IO;

import java.io.*;
//Q 2. Reading input from two files and storing it in a third file

public class IOLabTwo {
	
	static void readMe(File q,FileReader n) throws IOException {
		
		char c[]=new char[(int) q.length()];
		n.read(c);
		System.out.print(c);
		
		n.close();
	}

	public static void main(String[] args) throws Exception {
		
		File i=new File("Hello.txt");
		File j=new File("Name.txt");
		
		FileReader r=new FileReader("Hello.txt");
		FileReader s=new FileReader("Name.txt");
		FileReader n=new FileReader("New.txt");
		
		FileWriter w=new FileWriter("New.txt");
		
		char c1[]=new char[(int) new File("Hello.txt").length()];  //or i.length()
		char c2[]=new char[(int) j.length()];
		r.read(c1);
		s.read(c2);
		w.write(c1);
		w.write(c2);
		r.close();
		s.close();
		w.close();
		File q=new File("New.txt");
		IOLabTwo.readMe(q,n);
	}
}

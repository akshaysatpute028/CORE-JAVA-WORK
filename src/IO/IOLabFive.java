package IO;

import java.io.*;

public class IOLabFive {

	public static void main(String[] args) throws Exception {
		File i=new File("Words.txt");
		FileInputStream in=new FileInputStream(i);
		byte[] a=new byte[(int) i.length()];
		int count = 0,line=1;
		for(int j=0;j<i.length();j++) {
			a[j]=(byte) in.read();
			if(a[j]==32) count++;
			else if (a[j]==10) line++;
		}
		System.out.println("Number of words : "+(count+line)+" "+"\nNumber of lines :"+line);
	}
}

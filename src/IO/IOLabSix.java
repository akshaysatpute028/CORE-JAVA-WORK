package IO;

import java.util.Scanner;

//write a program to ask name of person and display name character by character in each line.
public class IOLabSix {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String name=s.next();
		for(int i=0;i<name.length();i++)
			System.out.println(name.charAt(i));
	}
}

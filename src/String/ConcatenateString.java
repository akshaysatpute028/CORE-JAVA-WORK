package String;

import java.util.Scanner;

public class ConcatenateString {

	public static void main(String[] args) {
		String s1,s2;
		Scanner s=new Scanner(System.in);
		System.out.print("String =");
		s1=s.next();
		System.out.print("String to Attach = ");
		s2=s.next();
		System.out.print("New string = "+s1.concat(s2));
	}

}

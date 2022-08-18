package NoobQ;

import java.util.Scanner;

public class JavaTrueFalse {
	String j="Java";
	String str="";
	Scanner s=new Scanner(System.in);
	
	void check() {
		
		System.out.print("Enter String : ");
		str=s.nextLine();
		
		if (j.equalsIgnoreCase(str.substring(0,4))) System.out.println("True");
		else  System.out.println("False");
	
	}

	public static void main(String[] args) {
		JavaTrueFalse j=new JavaTrueFalse();
		j.check();
	}
}

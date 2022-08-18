package ExceptionHandling;

import java.util.Scanner;
//Q.3
class ExternalOrInternal extends Exception {
	ExternalOrInternal(){System.out.println("External marks exceeds");}
	ExternalOrInternal(int a){System.out.println("Internal marks exceeds");}
}

public class ExceptionThreeUserDefined {
	
	static void checkMarks(int a,int b) {
		
		try {
			try {
				if(a>40) throw new ExternalOrInternal(a);
			}
			catch (ExternalOrInternal d) {
				//System.out.println(d);
			}
			try {
				if(b>60) throw new ExternalOrInternal();
			}
			catch (ExternalOrInternal e) {
				//System.out.println(e);
			}
		}
		finally {
			System.out.println("That's it !");
		}

	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Marks Twice : ");
		int a=s.nextInt(),b=s.nextInt();
		ExceptionThreeUserDefined.checkMarks(a, b);

	}

}

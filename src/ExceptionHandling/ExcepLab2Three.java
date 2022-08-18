package ExceptionHandling;

import java.util.Scanner;

public class ExcepLab2Three {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b;
		try {
			System.out.println("Enter 2 Numbers : ");
			a=s.nextInt();
			b=s.nextInt();
			if(a==0 || b==0) throw new ArithmeticException();
			else System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
}

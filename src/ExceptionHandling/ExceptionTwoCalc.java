package ExceptionHandling;

import java.util.*;
import java.util.Scanner;
//Q.2
public class ExceptionTwoCalc {
	
	static long power(int n,int p) {
	
    try {
		if(n==-n || p==-p) throw new  ArithmeticException();
		else if(n==0 || p==0) throw new InputMismatchException();
	}
	catch(ArithmeticException e) {
		System.out.println("n or p should not be negative");
	}
	catch(InputMismatchException e) {
		System.out.println("n or p should not be zero");
	  }
	  long c=(long) Math.pow(n, p);
	  return c;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 numbers : ");
		int a = s.nextInt(),b = s.nextInt();
		System.out.print(ExceptionTwoCalc.power(a, b));

	}

}

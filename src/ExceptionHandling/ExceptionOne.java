package ExceptionHandling;

import java.util.*;
//Q.1
public class ExceptionOne {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b;
	
		try {
			System.out.println("Enter value of a & b : ");
			a=s.nextInt();
			b=s.nextInt();
			System.out.print(a/b);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(InputMismatchException i){
			System.out.println(i);
		}
		System.out.println("That's it !");
	}

}

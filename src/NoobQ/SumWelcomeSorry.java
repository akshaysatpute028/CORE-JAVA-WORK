package NoobQ;

import java.util.Scanner;

public class SumWelcomeSorry {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int a,b,sum;
		System.out.print("Enter 2 numbers = ");
		a=s.nextInt();
		b=s.nextInt();
		
		sum=a+b;
		
		System.out.println("Sum = "+sum);
		if(sum>100)
			System.out.println("Welcome");
		else
			System.out.println("Sorry");	

	}

}
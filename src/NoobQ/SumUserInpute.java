package NoobQ;

import java.util.Scanner;

public class SumUserInpute {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,ans;
		System.out.print("Enter 2 numbers = ");
		a=s.nextInt();
		b=s.nextInt();
		
		ans=a+b;
		
		System.out.print("Sum = "+ans);

	}

}

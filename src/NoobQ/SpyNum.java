package NoobQ;

import java.util.Scanner;

public class SpyNum {
	int num,rem,mul=1,sum;
	Scanner s=new Scanner(System.in);
	
	void checkSpy() {
		System.out.print("Enter Number = ");
		num=s.nextInt();
		
		while(num!=0) {
			rem=num%10;
			mul*=rem;
			sum+=rem;
			num/=10;
		}
		System.out.print("\nSum = "+sum);
		System.out.print("\nMultiplication = "+mul);
		
		if(sum==mul) System.out.print("\nIt's a Spy number.");
		else System.out.print("\nIt's not a Spy number.");
	}
	
	public static void main(String[] args) {
		SpyNum n=new SpyNum();
		n.checkSpy();
	}
}

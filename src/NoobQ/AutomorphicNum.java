package NoobQ;

import java.util.Scanner;

public class AutomorphicNum {
	int num,sqr,i,rem,mul;
	int digits[]=new int [10];
	Scanner s=new Scanner(System.in);
	
	void check() {
		System.out.print("Enter a number = ");
		num=s.nextInt();
		sqr=num*num;
		System.out.print("\nSquare of number = "+sqr);
		
		if(sqr%10==num) System.out.print("\nIt's an Automorphic number");
		
		else if(sqr>100) {
			for(i=2;i>=0;i--) {
				while(sqr!=0){
				rem=sqr%10;
				mul=rem*10;
				mul+=rem;
				sqr/=10;	
			}
				if(mul==num) System.out.print("\nIt's an Automorphic number"); 
				else System.out.print("\nIt's not an Automorphic number");
		}
		
	  }
	}

	public static void main(String[] args) {
		AutomorphicNum a=new AutomorphicNum();
		a.check();
	}
}

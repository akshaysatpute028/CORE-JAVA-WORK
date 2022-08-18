package NoobQ;

import java.util.Scanner;

public class ReverseNum {
	int num,remain,rev = 0;
	Scanner s=new Scanner(System.in);
	
	void reverse() {
		System.out.println("Enter no = ");
		num=s.nextInt();
		while(num != 0) {
			remain = num % 10;
			rev = rev * 10 + remain;
			num = num/10;
			}
		System.out.println("The reverse of the given number is: " + rev);  
	}

	public static void main(String[] args) {
		
		ReverseNum r=new ReverseNum();
		r.reverse();

	}

}

package NoobQ;

import java.util.Scanner;

public class AverageSumOfDigit {
	int a,rem,sum,mul,count;
	float avg;
	Scanner s = new Scanner(System.in);
	
	void checkSum() {
		System.out.print("Enter number= ");
		a=s.nextInt();
		while(a!=0) {
			rem=a%10;
			sum+=rem;
			a=a/10;
			count++;
		}
		System.out.print("Sum of digits = "+sum);
		System.out.print("\nNo of digits = "+count);
	}
	
	void checkAverage() {
		avg=(float)sum/count;
		System.out.print("\nAverage of digits = "+avg);
	}

	public static void main(String[] args) {
		AverageSumOfDigit d=new AverageSumOfDigit();
		d.checkSum();
		d.checkAverage();

	}

}

package CoreLab;

import java.util.Scanner;

interface Test{
	void signature();
}
class MyCalculator implements Test{

	@Override
	public void signature() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=s.nextInt();
		int sum=0;
		for(int i=1;i<=1000;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		System.out.print("Sum of all divisors (between 1 to 1000) of "+num+" is equal to "+sum);
	}
}

public class CoreLabTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator m=new MyCalculator();
		m.signature();
	}
}

package Stats;

import Math.MathsOperations;                        

public class StatsOperation {
	
	static int average( int a, int b, int c) {
		int avg=(a+b+c)/3;
		return avg;
		
	}
	static int medain( int a, int b, int c) {
		if ((a < b && b < c) || (c < b && b < a)) return b;
		else if ((b < a && a < c) || (c < a && a < b)) return a;
        else return c;
	}

	public static void main(String[] args) { //Command Line Argument  [ 16 26 44 ]
		int a=Integer.valueOf(args[0]);
		int b=Integer.valueOf(args[1]);
		int c=Integer.valueOf(args[2]);
		System.out.println("Average : "+StatsOperation.average(a, b, c));
		System.out.println("Median : "+StatsOperation.medain(a, b, c));
		
		System.out.println("Max Number : "+MathsOperations.maxNumber(a, b, c)); //import Math.MathsOperations;
		System.out.println("Min Number : "+MathsOperations.minNumber(a, b, c));

	}
}

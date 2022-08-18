package NoobQ;

import java.util.Scanner;

public class FibonacciSeriesNum {
	
	static int fib(int n)
	    {
	    if (n <= 1)
	       return n;
	    return fib(n-1) + fib(n-2);
	    }
	      
	    public static void main (String args[])
	    {
	    	Scanner s=new Scanner(System.in);
	    int n;
	    System.out.print(" Enter No = ");
	    n=s.nextInt();
	    System.out.println("Fibonacci No = "+fib(n));
	    }
}

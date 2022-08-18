package Inheritance;

public class Calculation {
	
	static int substration(int a, int b) {
		int c=0;
		if(b>a) {
			System.out.print("\nERROR");
		}
		else return c=a-b;
		return c;
	}
	
	static int division( int a, int b) {
		int c=0;
		if(b==0) {
			System.out.print("\nERROR");
		}
		else return c=a/b;
		return c;
	}
}



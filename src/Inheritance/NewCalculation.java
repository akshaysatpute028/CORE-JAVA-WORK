package Inheritance;

public class NewCalculation extends Calculation {
	
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
	
	public static void main(String[] args) {
		int ans1,ans2,ans3,ans4;
		
		ans1=Calculation.substration(6,2);
		System.out.print("\n1.Substraction = "+ans1);
		ans2=Calculation.division(6,2);
		System.out.print("\n1.Division = "+ans2);
		
		System.out.println();

		ans3=NewCalculation.substration(8,4);
		System.out.print("\n2.Substraction = "+ans3);
		ans4=NewCalculation.division(8,4);
		System.out.print("\n2.Division  = "+ans4);

	
	}
}



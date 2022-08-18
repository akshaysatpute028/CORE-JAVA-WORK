package ExceptionHandling;
import java.io.*;
import java.util.Scanner;

interface IntOperations {
	void isPositiveNegative();
	void isEvenOdd();
	void isPrime();
	}

public class ExcepLab2Five implements IntOperations{
	private int number;
	ExcepLab2Five() {
		this.number=0;
		}
	ExcepLab2Five(int num){
		this.number=num ;
		}
	public void isPositiveNegative() {
		if(this.number<0) System.out.println("\nNumber Is Negetive...");
		else System.out.println("\nNumber Is Positive...") ;
	}
	
	public void isEvenOdd() {
		if(this.number%2==0) System.out.println("\nNumber Is Even...");
		else System.out.println("\nNumber Is Odd...");
	}
	
	public void isPrime() {
		int i = 2 ;
		while(i!=this.number) {
			if(this.number%i==0) {
				System.out.println("\nNumber Is Not Prime...");
				break;
			}
			i++;
		}
		if(this.number==i) System.out.println("\nNumber Is Prime...") ;
	}
	
	public static void main(String[] arg) throws Exception {
			Scanner s=new Scanner(System.in);
			System.out.println("\n1.Positive or Negative");
			System.out.println("\n2.Even or Odd");
			System.out.println("\n3.Prime") ;
			System.out.println("\n4.Exit") ;
			int num,choice=3;
			System.out.println("\nEnter Number :");
			num=s.nextInt();
			ExcepLab2Five o = new ExcepLab2Five(num);
	
		while(choice!=0) {
			
			switch(choice) {
			case 1:o.isPositiveNegative() ;
			break;
			
			case 2:o.isEvenOdd();
			break;
			
			case 3:o.isPrime();
			break;
			
			case 4:System.exit(0);
			break;
			
			default:System.out.println("Invalid choice.\nEnter again :");
			break ;
			}
			choice--;
		}
	}
}

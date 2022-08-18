package NoobQ;

import java.util.Scanner;

public class Divisible {
	int i,j,k;
	
	void checkTree() {
		for(j=1;j<100;j++)
			if(j%3==0) System.out.print(+j+" ");
	}
	void checkFive() {
		for(k=1;k<100;k++)
			if(k%5==0) System.out.print(k+" ");
	}
	
	void checkThreeFive() {
		for(i=1;i<100;i++)
			if(i%3==0 && i%5==0) System.out.print(i+" ");		
	}

	
	public static void main(String[] args) {
		Divisible d=new Divisible();
		int choice;
		Scanner s=new Scanner(System.in);
		System.out.print("1.Divisible by 3\n2.Divisible by 5\n3.Divisible by 3 & 5");
		
		do {
			System.out.print("\nEnter Choice = ");
			choice=s.nextInt();
			if(choice==1) { System.out.print("Numbers divisible by 3 : "); d.checkTree(); }
			else if(choice==2) {System.out.print("Numbers divisible by 5 : "); d.checkFive(); }
			else if(choice==3) {System.out.print("Numbers divisible by 3 & 5 : "); d.checkThreeFive(); }
			else System.out.print("\nEnter correct choice = ");
		}while(choice!=3);
	}
}

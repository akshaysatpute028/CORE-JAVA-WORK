package Inheritance;

import java.util.Scanner;

public class RBI {

	public static void main(String[] args) {
		int choice=0;
		System.out.println("\n1.Bank \n2.Saving Account \n3.Over-Draft");
		Scanner s=new Scanner(System.in);
		do {
			System.out.println("\nEnter Choice = ");
			choice=s.nextInt();
			if(choice==1) {
				System.out.println("\n<<<<<<<<<<  STATE BANK OF INDIA  >>>>>>>>>>>>>");
				Bank.input();
				Bank.diposite();
				Bank.withrawal();
				Bank.display();
				System.out.println();
			}
			else if(choice==2) {
				Saving.diposite();
				Saving.withrawal();
				Saving.display();
				System.out.println();
			
			}
			else if(choice==3) {
				Overdraft.diposite();
				Overdraft.withrawal();
				Overdraft.display();
				System.out.println();
			}else System.out.print("\nIncorrect Choice !!!");
			
		}while(choice!=0);
		
	}

}

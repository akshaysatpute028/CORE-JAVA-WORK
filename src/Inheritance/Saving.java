package Inheritance;

public class Saving extends Bank {
	
	static void diposite() {
		System.out.println("\n<<<<<<<<<<Saving ACCOUNT>>>>>>>>>>>>>");
		System.out.print("\nEnter Amount to Diposite = ");
		diposite=s.nextInt();
		System.out.print("\nCurrent Account Balance = "+bal);
		bal+=diposite;
		System.out.print("\nBalance After Diposite = "+bal);
	}
	static void withrawal() {
		System.out.print("\nEnter Amount to Diposite = ");
		withraw=s.nextInt();
		System.out.print("\nCurrent Account Balance = "+bal);
		bal-=withraw;
		System.out.print("\nBalance After Withdaw = "+bal);
	}
}

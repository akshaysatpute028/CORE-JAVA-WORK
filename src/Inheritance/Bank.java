package Inheritance;

import java.util.Scanner;

public class Bank {
	static int bal=15000,diposite,withraw,accno=12345;
	static String name="Akshay";
	static Scanner s=new Scanner (System.in);
	
	static void input() {
		name="Akshay";
		System.out.print("\nEnter Amount To Diposite = ");
		diposite=s.nextInt();
		System.out.print("\nEnter Amount To Withdaw = ");
		withraw=s.nextInt();
	}
	static void diposite() {
		System.out.print("\nCurrent Account Balance = "+bal);
		bal+=diposite;
		System.out.print("\nBalance After Diposite = "+bal);
	}
	static void withrawal() {
		bal-=withraw;
		System.out.print("\nBalance After Withdaw = "+bal);
	}
	static void display() {
		System.out.println();
		System.out.print("\nName of Customer = "+name);
		System.out.print("\nAccount no of Customer = "+accno);
		System.out.print("\nAccount Balance = "+bal);
	}

	public static void main(String[] args) {
		Bank.input();
		Bank.diposite();
		Bank.withrawal();
		Bank.display();

	}

}

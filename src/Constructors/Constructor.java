package Constructors;

import java.util.Scanner;

public class Constructor {
	static int z;
	Constructor() {
		this("Is the sum of numbers is even ?");
		System.out.print("Sum =");
	}
	Constructor(String str) {
		System.out.println(str);
	}
	Constructor(int x,int y) {
		this();
		z=x+y;
		System.out.println(" "+z);
	}
	Constructor(int i) {
		if(i%2==0)System.out.println("Yes it is.");
		else System.out.println("Nope");
	}
	
	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter two numbers = ");
		a=s.nextInt();b=s.nextInt();
		new Constructor(a,b);
		new Constructor(z);
	}
}
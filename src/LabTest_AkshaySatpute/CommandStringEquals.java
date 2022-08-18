package LabTest_AkshaySatpute;

import java.util.Scanner;

public class CommandStringEquals {

	static void checkStrings(String args[],String name) {
		
		if(args[0].equals(name)) System.out.println("Correct User Name !");
		else System.out.println("Invalid User !");
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter name of the user to login : ");
		String name=s.next();
		
		CommandStringEquals.checkStrings(args,name);
	}

}

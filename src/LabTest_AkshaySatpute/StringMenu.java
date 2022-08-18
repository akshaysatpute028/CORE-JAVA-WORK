package LabTest_AkshaySatpute;

import java.util.Scanner;

public class StringMenu {
	static Scanner s=new Scanner(System.in);

	static void upperCase(String check) {
		System.out.print(check.toUpperCase());
		
	}

	static void lowerCase(String check) {
		System.out.print(check.toLowerCase());
	}
	
	static void charByChar(String check) {
		for(int i=0;i<check.length();i++) {
			System.out.print(" "+check.charAt(i));
		}
	}

	static void concatStringByChar() {
		System.out.print("\nEnter String 1 : ");
		String check1=s.nextLine();
		System.out.print("\nEnter String 2 : ");
		String check2=s.nextLine();
		System.out.print("Enter char to check in strings and concat : ");
		char c=s.next().charAt(0);

		for(int i=0;i<check1.length();i++) {
			for(int j=0;j<check2.length();j++) {
				if(check1.charAt(i)==c && check2.charAt(j)==c) {
					System.out.println((check1.substring(i, check1.length()))+(check2.substring(j, check2.length())));
				}
			}
		}
	}

	static void palindrom(String check) {
		int i = 0, j = check.length() - 1;
		boolean flag=false;
        while (i < j) {
            if (check.charAt(i) != check.charAt(j))
                flag=false;
            i++;
            j--;
        }
        if(flag==true) System.out.println("String is Palindrom");
        else System.out.println("String is not Palindrom");
		if(check.length()>4){
			System.out.println(check.substring(0, 4));
			System.out.println(check.replace('a', 'o'));
		}
		else System.out.println("String length is less than 4 !!");
	}

	public static void main(String[] args) {
		int choice;String check;
		Scanner s=new Scanner(System.in);
		System.out.print("1.String to Upper case \n2.String to Lower case \n3.Char by Char String "
				+ "\n4.Concat string when specific char occurs \n5.Check if string is Palindrom");
		System.out.print("\nEnter String : ");check=s.nextLine();
		do {
			System.out.print("\nEnter choice : ");
			choice=s.nextInt();
			
			if(choice==1) {StringMenu.upperCase(check);}
			else if (choice==2) {StringMenu.lowerCase(check);}
			else if (choice==3) {StringMenu.charByChar(check);}
			else if (choice==4) {StringMenu.concatStringByChar();}
			else if (choice==5) {StringMenu.palindrom(check);}
			else System.out.print("Incorrect choice !");
		}while(choice!=5);
	}

}

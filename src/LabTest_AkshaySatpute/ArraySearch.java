package LabTest_AkshaySatpute;

import java.util.Scanner;

public class ArraySearch {
	static int num[]=new int[10];
	static Scanner s=new Scanner(System.in);
	
	static void getInput() {
		System.out.println("Enter 10 Numbers : ");
		for(int i=0;i<num.length;i++)
			num[i]=s.nextInt();
	}
	static void searchKey() {
		System.out.println("Enter Key : ");
		int key=s.nextInt();
		int flag=0;
		for(int i=0;i<num.length;i++)
			if(key==num[i]) flag=1;
		if(flag==1)System.out.println("Key Found");
		else System.out.println("Key Not Found");
	}
	static void displayInput() {
		System.out.print(" [");
		for(int i=0;i<num.length;i++) {
			System.out.print(" "+num[i]);
		}
		System.out.print(" ]");
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("*Integer Array Menu*");
		int choice;
		do {
			System.out.println("\n1.GetInput() \n2.SearchKey() \n3.DisplayInput() \n4.Exit");
			System.out.println("\nEnter Choice : ");
			choice=s.nextInt();
			if(choice==1) ArraySearch.getInput();
			else if(choice==2) ArraySearch.searchKey();
			else if(choice==3) ArraySearch.displayInput();
			else if(choice==4) break;
		}while(choice!=4);
	}
}

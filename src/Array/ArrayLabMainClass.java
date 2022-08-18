package Array;

import java.util.Scanner;

public class ArrayLabMainClass {

	public static void main(String[] args) {
		ArrayLab a=new ArrayLab();
		Scanner s=new Scanner(System.in);
		int choice=0;
		
		System.out.print("1.Count of even number in an Array \n2.Reverse Array \n3.Sum of Array elements "
				+ "\n4.Duplicate Array \n5.Large Number in an Array "
				+ "\n6.Check if key is present in an array \n7.Bubble Sort of an Array \n8.Input");		
		do {
			System.out.print("\nEnter Choice = ");
			choice=s.nextInt();	
			if(choice==1) {
				a.display();
				a.evenCount();
			}
			else if(choice==2) {
				a.display();
				a.reverse();
			}
			else if(choice==3) {
				a.display();
				a.sumArray();
			}
			else if(choice==4) {
				a.display();
				a.copyArray();
			}
			else if(choice==5) {
				a.display();
				a.largestKey();
			}
			else if(choice==6) {
				a.display();
				a.searchKey(); 
			}
			else if(choice==7) {
				a.display();
				a.bubbleSort();
			}
			else if(choice==8) {
				a.input();
			}
			else System.out.print("\nIncorrect choice");
			
		}while(choice!=7);
	}

}

package LabTest_AkshaySatpute;

import java.util.Scanner;

public class DefineArray {
	int evenarray[]=new int[10];
	int oddarray[]=new int[10];
	
	void even(int num[]) {
		int count=0;
		for(int i=0;i<num.length;i++) {
					if(num[i]%2==0) { 
					evenarray[count]=num[i];
					count++;
				}
			}
		System.out.print("\nArray of Even Numbers = [");
		for(int j=0;j<count;j++) {
			System.out.print(" "+evenarray[j]);
			}
		System.out.print(" ]");
	}
	
	void odd(int num[]) {
		int count=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]%2!=0) {
				oddarray[count]=num[i];
				count++;
			}
		}
		System.out.print("\nArray of Even Numbers = [");
		for(int j=0;j<count;j++) {
			System.out.print(" "+oddarray[j]);
			}
		System.out.print(" ]");
	}
	
	public static void main(String[] args) {
		DefineArray d=new DefineArray();
		int num[]=new int[10];
		int l=num.length;
		Scanner s=new Scanner(System.in);
		System.out.print("\nEnter 10 Numbers To Sort In Even & Odd Array = ");
		for(int i=0;i<l;i++) {
		num[i]=s.nextInt();
		}
		d.even(num);
		d.odd(num);
		
	}
}

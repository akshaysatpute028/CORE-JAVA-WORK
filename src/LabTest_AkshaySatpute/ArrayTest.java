package LabTest_AkshaySatpute;

import java.util.Scanner;

public  class ArrayTest {
	
	int arr[]=new int [10];
	int l=arr.length;
	
	int i,j,count;

	static Scanner s=new Scanner(System.in);	
	
	void getArray() {
		System.out.print("Enter numbers = ");
		for(i=0;i<l;i++) {
				arr[i]=s.nextInt();
			}
	}
	
	void showArray() {
		
		System.out.print("\nGiven Array = [");
		for(i=0;i<l;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.print(" ]");		
	}

	void searchArray(int a) {
		System.out.println("Check if the key num "+a+" is present : ");
		for(i=0;i<l;i++) {
		if(a==arr[i]) System.out.print("True");
		}
	}
	
	void sortArray() {
		int temp=0;
		for(j=0;j<l-1;j++) {
		for(i=0;i<l-1;i++) {
			if(arr[i]>arr[i+1]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				}
			}
		}
		System.out.print("\nSorted Array = [");
		for(int k=0;k<l;k++) {
			System.out.print(" "+arr[k]);
		}
		System.out.print(" ]");	
	}

	public static void main(String[] args) {	
		int key; 
		ArrayTest a=new ArrayTest();
		a.getArray();
		a.showArray();
		System.out.print("\nEnter key to search = ");
		key=s.nextInt();
		a.searchArray(key);
		a.sortArray();

	}

}

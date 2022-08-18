package Array;

import java.util.Scanner;

public  class ArrayLab {
	public static int key=60;
	int arr[]=new int [5]; int rev[]=new int [5]; int copy[]=new int [5];
	int l=arr.length;
	
	int i,j,sum,count,n=5;
	boolean b=true;
	Scanner s=new Scanner(System.in);	
	
	void input() {
		System.out.print("Enter numbers = ");
		for(i=0;i<l;i++) {
				arr[i]=s.nextInt();
			}
	}
	
	void display() {
		
		System.out.print("\nGiven Array = [");
		for(i=0;i<l;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.print(" ]");		
	}
	
	void evenCount() {
		for(i=0;i<l;i++) {
			if(arr[i]%2==0) count++;
			}
		System.out.print("\nCount of Even Numbers in Array = "+count);
	}
	
	
	void reverse() {
		int k=n;
			for(i=0 ;i<l ;i++) {
			rev[k-1]=arr[i];
			k=k-1;
			}
			System.out.print("\nReverse Array = [");
			for(j=0;j<l;j++) {
				System.out.print(" "+rev[j]);
			}
			System.out.print(" ]");
	}
	
	void sumArray() {
		for(i=0;i<l;i++) {
			sum+=arr[i];
			}
		System.out.print("\nSum of Array elements  = "+sum);
	}
	
	void copyArray() {
		for(i=0 ;i<l ;i++) {
			copy[i]=arr[i];
			}
		
		System.out.print("\nDuplicate Array = [");
		for(j=0;j<l;j++) {
			System.out.print(" "+copy[j]);
		}
		System.out.print(" ]");
	}
	
	void largestKey() {
		int temp=0;
		for(j=0;j<l-1;j++) {
		for(i=0;i<l-1;i++) {
			if(arr[i]>arr[i+1]) {
				temp=arr[i];
				}
			else temp=arr[i+1];
			}
		}System.out.println("\nLargest Number = "+temp);
	}
	
	void searchKey() {
		int a;
		System.out.println("Enter key to search = ");
		a=s.nextInt();
		
		boolean flag=false;
		System.out.println("Check if the key num "+a+" is present : ");
		for(i=0;i<l;i++) {
			if(a==arr[i]) {
				flag=true;
			}
		}
		if(flag) {
			System.out.println("KEY FOUND");
		}
		else System.out.println("KEY NOT FOUND");
	}
	
	void bubbleSort() {
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
		
		ArrayLab a=new ArrayLab();
		a.input();
		a.display();
		a.evenCount();
		a.reverse();
		a.sumArray();
		a.copyArray();
		a.largestKey();
		a.searchKey();
		a.bubbleSort();

	}

}

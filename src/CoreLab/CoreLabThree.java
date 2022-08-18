package CoreLab;

import java.util.Scanner;

public class CoreLabThree {
	
	static void checkLeader(int[] arr,int n) {
		System.out.println("Array Leaders : ");
		int max=Integer.MAX_VALUE;
		for(int i=0;i<n-1;i++) {
				max=Math.max(arr[i],arr[i+1]);
		}
		if(arr[n-1]<arr[n-2])
			System.out.print(arr[n-1]+" ");
		System.out.print(max);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int n=s.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter array elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println();
		System.out.print("Array : [");
		for(int i=0;i<n;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.print(" ]");
		System.out.println();
		checkLeader(arr,n);
	}

}

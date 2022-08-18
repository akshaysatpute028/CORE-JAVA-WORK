package Demo;

import java.util.*;

public class OddEvenSeries {
	
	private static void series() {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int n=s.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n-1;i++) {
			if(i==0) {
				arr[i]=a;
				arr[i+1]=b;
				if(a>b) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			else {
				int add=arr[i-1]+arr[i];
				int mod=add%2;
				if((mod==0)||(mod==1))
					arr[i+1]=add;
			}
			if(arr[i]%2==0)
				System.out.print(arr[i]+" ");
		}
		if(arr[n-1]%2==0)
			System.out.print(arr[n-1]);
		
		System.out.println();
		for(int i=0;i<n;i++) 
			if(arr[i]%2==1) 
				System.out.print(arr[i]+" ");
	}
	
	public static void main(String[] args) {
		series();
	}
}

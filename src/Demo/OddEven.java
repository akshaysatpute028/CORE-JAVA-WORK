package Demo;

import java.util.*;

public class OddEven {

	private static void series() {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int n=s.nextInt();
		
		int mod;
		int arr[]=new int[n];
		
		float m=n;
		int odd=Math.round(m/2)+1;
		int even=n-odd;
		System.out.println(even+" "+odd);
		
		for(int i=0;i<arr.length-1;i++) {
			if(i==0) {
				arr[i]=a;
				arr[i+1]=b;
			}
			else {
				mod=(arr[i-1]+arr[i])%2;
				if((mod==0)||(mod==1)) {
				arr[i+1]=arr[i-1]+arr[i];
				}
			}
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			if(arr[i]%2==0)
				System.out.print(arr[i]+" ");
		}
		if(arr[n-1]%2==0)
			System.out.print(arr[n-1]);
		System.out.println();
		
		for(int i=0;i<arr.length;i++) 
			if(arr[i]%2==1) 
				System.out.print(arr[i]+" ");
	}

	public static void main(String[] args) {
		OddEven o =new OddEven();
		series();
	}
}

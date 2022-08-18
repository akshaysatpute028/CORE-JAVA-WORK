package CoreLab;

import java.util.Scanner;

public class Q3GreaterIndexInArray {
	
	 void ArrayLeader( int arr[])
	{
		 System.out.println("The Leaders in an Array are : ");
		 
		 System.out.print("[ ");
		 
		 for(int i=0;i<arr.length-1;i++)
		 {int flag=0;
			 for(int j=i;j<arr.length-1;j++)
			 {
				 if(arr[i]>arr[j+1]) 
					 continue;
				 else
					 flag++;
					 break;
			 }
			 if (flag==0)
			 System.out.print(arr[i]+" ");
		 }
		 System.out.print(arr[arr.length-1]);
		 System.out.println(" ]");
		 
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the numbers in an array : ");
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the index value : ");
			int r=sc.nextInt();
			arr[i]=r;
		}
		
		System.out.println("The array is :  ");
		
		System.out.print("[");
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+arr[i]+" ");
		}
		System.out.println("]");
		
		Q3GreaterIndexInArray m=new Q3GreaterIndexInArray();
		
		m.ArrayLeader(arr);

	}

}

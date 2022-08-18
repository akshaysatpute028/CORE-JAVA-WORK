package ProblemSolving;

import java.util.Scanner;

public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
	    Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		
		do{
		   int n=s.nextInt();
		   int arr[]=new int[n];
		   for(int i=0;i<n;i++){
		       arr[i]=s.nextInt();
		   }
		   int key=0 ,count=0;;
		   for(int i=0;i<n-1;i++){
			   key=arr[i];
			   for(int j=1;j<n-1;j++){
				   if(key==arr[j]){
		           count++;
		       }
			  }
		   }
		 
		    T--;
		}while(T!=0);
		}catch(Exception e) {}
	}
}
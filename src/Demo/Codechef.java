package Demo;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
		    int n=s.nextInt();
		    Stack<Integer> si=new Stack<Integer>();
		    if((n & 1)==0){
		        for(int i = 1,j=n,k=1;i <= n && j>=1;++i){
		            //((i&1)==1) ? si.push(i) : si.push(j);
		            if((i&1)==1)
		            si.push(k++);
		            else
		            si.push(j--);
		        }
		    }
		    else{
		        for(int i = 1,j=n,k=1;i <= n && j>=1;++i){
		          //((i&1)==1) ? si.push(j) : si.push(i);
		            if((i&1)==0)
		            si.push(j--);
		            else
		            si.push(k++);  
		    }
		}
		for (int i=0;i<n ;i++ ) {
		    System.out.print(si.peek()+" ");
		    si.pop();
		}
		System.out.println();
		}
	}
}

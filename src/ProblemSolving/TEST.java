package ProblemSolving;

import java.util.Scanner;

public class TEST {
	
	static boolean isPossible(int a[], int n)
	{
	    int cur = a[0];
	    cur--;
	    for (int i = 1; i < n; i++)
	    {
	        int nxt = a[i];
	        if (nxt > cur)
	            nxt--;
	        else if (nxt < cur)
	            return false;
	        cur = nxt;
	    }
	    return true;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int n=s.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<t;i++) {
			for(int j=0;j<n;j++) {
				a[i]=s.nextInt();
			}
			 if (isPossible(a, n))
			        System.out.println("Yes");
			    else
			        System.out.println("No");
		}
	}
}



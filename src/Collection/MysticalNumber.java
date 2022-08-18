package Collection;

import java.util.*;
import java.lang.*;
import java.io.*;

public class MysticalNumber {
	public static void main (String[] args) throws java.lang.Exception {

		Scanner s=new Scanner(System.in);
		System.out.print("No of test cases : ");
		int t=s.nextInt();
		while(t-->0){
			System.out.print("Size of Array : ");
		    int n=s.nextInt();
		    ArrayList<Integer>a=new ArrayList<Integer>();
		    System.out.print("Add Array Element : ");
		    for(int i=0;i<n;i++) a.add(s.nextInt());
		    System.out.print("Enter No Of Quries : ");
		    int q=s.nextInt();
		    while(q-->0){
		    	System.out.print("Enter value of x : ");
		        int x=s.nextInt();
		        int count=0;
		        for(int i=0;i<a.size();i++)
		            if((a.get(i)^x)>(a.get(i)&x)) count ++;
		        System.out.println("Mystical Numbers : "+count);
		        a.remove(0);
		    }
		}
	}
}


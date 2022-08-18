package String;

import java.util.Scanner;

public class prac {
public static void main(String arg[])
{int tke;

int i;
String n;
String k;

Scanner s=new Scanner(System.in);
	System.out.println("enter no of Strings");
	tke=s.nextInt();
	
	String f[]=new String[3];
	for(i=0;i<tke;i++)
	{
		System.out.println("Enter Element : " );
		f[i]=s.next();
	}
	System.out.println("Enter Element to search");
	k=s.next();
	boolean found =true;
	for(i=0;i<tke;i++)
	{
	if(k.equals(f[i]))
	{
		System.out.println(" Element found at" + (i+1));
		found=true;
		
	}
	}
	if(!found==false)
	System.out.println("  not Element found at" );
	}
}
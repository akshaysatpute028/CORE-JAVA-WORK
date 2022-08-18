package String;

import java.util.Scanner;

public class Q2 {
	
Scanner sc=new Scanner(System.in);

String greater( int a,int b)
{if (a>b)
	return "M is greAter then N";
else
	return "N is Greater the M";
	}

String greater1( int x,int y,int z)
{   if (x>y && y>z)
	return "X is greAter among all";
	
else if (y>x && y>z)
	return "Y is Greater among all";
	
else return "Z is Greater among all";
}	


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
	   Q2 q2=new Q2();
       int m,n,x,y,z;
       int choice;
       System.out.println("Enter the Choice");
       System.out.println("1.greater among 2 number");
       System.out.println("2.greater among 3 number");
       System.out.println("3.Exit");
       
       choice=s.nextInt();

switch(choice)
{
case 1: System.out.println("please enter the value of M");
        System.out.print("M=");
        m=s.nextInt();
        System.out.println("please enter the value of N");
        System.out.print("N=");
        n=s.nextInt();
	    String k= q2.greater(m,n);
	    System.out.println(k);
        break;
        
case 2: System.out.println("please enter the value of X");
        System.out.print("X=");
        x=s.nextInt();
        System.out.println("please enter the value of Y");
        System.out.println("Y=");
        y=s.nextInt();
        System.out.println("please enter the value of Z");
        System.out.println("Z=");
        z=s.nextInt();
        
        String k1= q2.greater1( x, y, z);
        System.out.println(k1);
        break;
        
default :System.out.println("out of range");
         break;

       }
      }
	}

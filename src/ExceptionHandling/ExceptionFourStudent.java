package ExceptionHandling;

import java.util.*;
//Q.4
class AgeOrName extends Exception {
	AgeOrName(){
		System.out.println("AgeNotWithinRangeException");
	}
	AgeOrName(int a){
		System.out.println("NameNotValidException");
	}
}

public class ExceptionFourStudent {
	int rollno,age;
	String name,course;
	ExceptionFourStudent(int r,int a,String n,String c) {
		
		rollno=r;age=a;name=n;course=c;
		
		try {
			try {
				if(a>15 && a<21) throw new AgeOrName();
			}
			catch(AgeOrName o){
				//System.out.println(o);
			}
			try {
				boolean flag=true;
				for(int i=0;i<n.length();i++) {
					if(n.charAt(i)>33 && n.charAt(i)<64) {
						flag=false;
					}
				}
				if(flag==false) throw new AgeOrName(1);
				else System.out.println("Name is valid");
			}
			catch(AgeOrName t) {
				//System.out.println(t);
			}
		}
		finally{
			System.out.println("That's it !");
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r, a;
		String n, c;
		System.out.println("Enter Name : ");
		n=s.nextLine();
		System.out.println("Enter Roll No : ");
		r=s.nextInt();
		System.out.println("Enter Age : ");
		a=s.nextInt();
		System.out.println("Enter Course : ");
		c=s.next();
		new ExceptionFourStudent(r,a,n,c);
	}

}

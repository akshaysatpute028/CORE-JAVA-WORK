package Demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

class AccountHolder
{
	String name;
	int AccountNo;
	int Salary;
	public AccountHolder(String name, int accountno, int salary) {
		super();
		this.name = name;
		AccountNo = accountno;
		Salary = salary;
	}
	@Override
	public String toString() {
		return "AccountHolder [Name= " + name + ", AccountNo= " + AccountNo + ", Salary =" + Salary + "]";
	}
	
}
public class BankRecord {

	public static void main(String[] args) {
		AccountHolder A[]=new AccountHolder[2];
		int  Salary,AccountNo;
		String Name;
		Scanner K= new Scanner (System.in);
		for (int i=0;i<A.length;i++) {
			System.out.print("Enter Name = ");
			Name =K.next();
			System.out.print("Enter Account No = ");
			AccountNo =K.nextInt();
			System.out.print("Enter Salary = ");
			Salary =K.nextInt();
			A[i]=new AccountHolder(Name,AccountNo,Salary);
			System.out.println();
		}
		
		LinkedList <AccountHolder> l= new LinkedList();
		for (int i=0;i<A.length;i++) {
			l.add (A[i]);
		}
		
		System.out.println(l);
		
		System.out.println("Next : ");
		
		ListIterator Li= l.listIterator();
	    while(Li.hasNext()) {	
	    	System.out.print(Li.next());
	    }
	    
	    System.out.println("Previous : ");
		while(Li.hasPrevious()) {
			System.out.print( "  "+Li.previous());
		}
	}
		
}
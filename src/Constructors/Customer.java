package Constructors;

import java.util.Scanner;

public class Customer {

	String custname;
	int age;
	String adress;
	Customer(String cname,int age,String adress)
	{
		this.custname=cname;
		this.age=age;
		this.adress=adress;
	}
	void display()
	{
		System.out.println("customer name:"+custname);
		System.out.println("customer age:"+age);
		System.out.println("customer adress:"+adress);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Customer [] obj=new Customer[5];
		
		String custname;
		int age;
		String adress;
		
		for(int i=0;i<5;i++)
		{
			System.out.println("enter the customer name:");
			custname=s.next();
			System.out.println("enter the customer age:");
			age=s.nextInt();
			System.out.println("enter the customer adress:");
			adress=s.next();
			obj[i]=new Customer(custname,age,adress);
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("============================================");
			System.out.println("customer no:"+(i+1));
			obj[i].display();
		}

	}

}


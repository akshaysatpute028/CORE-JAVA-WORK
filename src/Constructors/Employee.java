package Constructors;

import java.util.Scanner;

public class Employee {
	 int Salary;
	 int Hours;
	
void GetInfo(int Salary,int Hours)
{
	this.Salary=Salary;
	this.Hours=Hours;	
}
void AddSal()
{
	if(Salary<50000)
	{
		Salary=Salary + 10000;
	System.out.print("\nSalary after Bonus "+Salary);
	}
	
}
void Addwork()
{
	if(Hours>6)
	{
		Salary = Salary + 5000;
	System.out.print("\nSalry After Work Hour Bonus = "+Salary);
	}
	
	System.out.print("\nFinal Salary = "+Salary);
}

	public static void main(String[] args) {
	
	Scanner s = new Scanner (System.in);
	System.out.print("Enter the amount of Salary=");
	int Salary=s.nextInt();
	System.out.print("Enter the Number Of Hours Work done in a Day=");
	int	Hours=s.nextInt();
	Employee e=new Employee();
	e.GetInfo(Salary,Hours);
	e.AddSal();
	e.Addwork();

	}

}
package LabTest_AkshaySatpute;

import java.util.Scanner;

public class Employee {
	String name;
	int salary;
	int age;
	int empid;
	static Scanner s = new Scanner (System.in);
	 
	 void getEmployee() {
		 System.out.print("\nEnter Employee ID : ");
		 empid=s.nextInt();
		 System.out.print("\nEnter Employee Name : ");
		 name=s.nextLine();
		 System.out.print("\nEnter Employee Age : ");
		 age=s.nextInt();
		 System.out.print("\nEnter Employee Salary : ");
		 salary=s.nextInt();
		 System.out.println();
	 }
	 void showEmployee() {
		 System.out.print("\nEmployee ID : "+empid);
		 System.out.print("\nEmployee Name : "+name);
		 System.out.print("\nEmployee Age : "+age);
		 System.out.print("\nEmployee Salary : "+salary);
		 System.out.println();
	 }
	 void addBonus() {
		 if(age>40) {
			 salary += 5000;
			 System.out.print("\nSalary after Bonus "+salary);
		}
		 else if(age<40) {
			 salary += 1000;
			 System.out.print("\nSalary after Bonus "+salary);
		 }
	 }

	public static void main(String[] args) {
		Employee e=new Employee();
		e.getEmployee();
		e.showEmployee();
		e.addBonus();
		Employee e1=new Employee();
		e1.getEmployee();
		e1.showEmployee();
		e1.addBonus();
		Employee e2=new Employee();
		e2.getEmployee();
		e2.showEmployee();
		e2.addBonus();

	}

}
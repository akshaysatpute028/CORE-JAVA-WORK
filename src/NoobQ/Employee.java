package NoobQ;

import java.util.Scanner;

public class Employee {
	int money=200,salary,workhours,day;
	Scanner s=new Scanner(System.in);
	
	void getInfo(){
		System.out.print("Enter number of work hours = ");
		workhours=s.nextInt();
		day=money*workhours;
		salary=day*30;
	}
	void AddSal() {
		if(salary<50000) {
			salary+=1000;
		}
	}
	void AddWork() {
		if(workhours>6) {
			salary+=5000;
		}
	}
	void Display() {
	System.out.print("\nSalary per month = "+salary);
	}
	
	public static void main(String[] args) {
		Employee e=new Employee();
		e.getInfo();
		e.AddSal();
		e.AddWork();
		e.Display();
	}
}

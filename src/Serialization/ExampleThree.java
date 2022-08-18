package Serialization;
import java.io.*;
import java.util.Scanner;
//Wap to define a class for employee having fields as empno ,name and addresss.
//Ask employee details from user using scanner in input method
//Display details using display method .Write whole data to file

class Employee implements Serializable{
	int empno;
	String name;
	String address;
	void getDetails() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Employee Name:");
		name=s.next();
		System.out.print("Enter Employee Number :");
		empno=s.nextInt();
		System.out.print("Enter Employee Address :");
		address=s.next();
	}
	void displayDetails() {
		System.out.println(name);
		System.out.println(empno);
		System.out.println(address);
	}
}
public class ExampleThree {

	public static void main(String[] args) throws Exception{
		
		Employee e=new Employee();
		e.getDetails();
		e.displayDetails();
		System.out.println();
		
		FileOutputStream o=new FileOutputStream("Employee.dat"); //Serialzation  (Delete this line of code to check diff)
		ObjectOutputStream oo=new ObjectOutputStream(o);          
		oo.writeObject(e);
		oo.close();
		
		Employee e2=new Employee();
		FileInputStream i=new FileInputStream("Employee.dat");  //Deserialzation
		ObjectInputStream oi=new ObjectInputStream(i);
		e2=(Employee)oi.readObject();
		oi.close();
		
		e2.displayDetails();
	}

}
package Interface;

import java.util.Scanner;

interface library {
	String libname="DPL";    // public static and final 
	void registration();     //public abstract 
	void display();
	}

interface person {  //extends library 

	}

abstract class test {
	}
class test2 extends test{
	}

public class InterfaceExample  extends test2 implements library  ,person {
  String name;
  int age;
  
  public void input () {   
	  
  }
  
  public void registration()
	{
	Scanner s= new Scanner(System.in)		;
	System.out.println("enter name and age");
	name=s.next();
	age=s.nextInt();
	}
  public void display() {
		System.out.println(name+ age + libname);
	}
  
  public static void main(String[] args) {
		InterfaceExample m= new InterfaceExample();
		m.registration();
		m.display();

	}

}
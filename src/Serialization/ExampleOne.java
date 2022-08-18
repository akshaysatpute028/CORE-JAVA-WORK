package Serialization;

import java.io.*;

//program -----> file write
//object -->file --> write--> objectoutputstream 
//to write class object data to file the class must be Serilizable
//Serializable is a marker interface 
//marker interface are empty interface 
//object  3 states -->  transient | persistant  | detached  
//if we donot inherit Serialzable ---> then NotSerializableException
class student   implements Serializable
{
	String name;
	int age;
	void get()
	{
		name="neha";
		age=22;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(age);
	}
}

public class ExampleOne 
{

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	
     student s= new student();
     s.get();
     
     //student2.txt will automatically created
     FileOutputStream d= new  FileOutputStream("student2.txt");
    		 
     ObjectOutputStream o= new ObjectOutputStream(d);
     
     o.writeObject(s);//writing object data to file 
     o.close();
     
     ObjectInputStream i= new ObjectInputStream (new FileInputStream("student2.txt"));
     s=  (student) i.readObject();//readObject return Object --> downcast
     s.display();
	
	}

}
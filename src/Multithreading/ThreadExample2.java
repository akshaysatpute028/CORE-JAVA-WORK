package Multithreading;

import java.lang.*;

public class ThreadExample2 {

	public static void main(String[] args) {
		 //Thread t= new Thread();
		 Thread t= Thread.currentThread();
		 System.out.println(t.getName());  //main
		 System.out.println(t.getPriority()); //1 to 10  main  5
		 System.out.println(t.isAlive());
		
		 t.setName("CDAC");
		 
		 t.setPriority(10);
		 
		 System.out.println(t.getName());
		 System.out.println(t.getPriority());
		 System.out.println(t.isAlive());
	}
}
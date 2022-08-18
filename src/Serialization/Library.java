package Serialization;

import java.io.*;
import java.util.Scanner;

import Serialization.Appendable;

public class Library implements Serializable {

	String bname,aname;
	int price;

	public void getMethod() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Book Name : ");
		bname=s.next();
		System.out.print("Enter Author Name : ");
		aname=s.next();
		System.out.print("Enter Price : ");
		price=s.nextInt();
	}
	public void displayMethod() {
		System.out.println("Book Name = "+bname);
		System.out.println("Author Name = "+aname);
		System.out.println("Price = "+price);
		System.out.println();
	}
	public void writeToFile(Library l) throws Exception {
		try {
			File i=new File("LibraryBook.dat");
			
			int len=(int) i.length();
			if(len>0) {
				FileOutputStream fo=new FileOutputStream("LibraryBook.dat",true);
				Appendable sd=new Appendable(fo);
				sd.writeObject(l);
				sd.close();
			}
			else {
				FileOutputStream fo=new FileOutputStream("LibraryBook.dat",true);
				ObjectOutputStream oo=new ObjectOutputStream(fo);
				oo.writeObject(l);
				oo.close();
			}
		  }catch(Exception e) {
			  System.out.println();
		  }
		
	}
	public void readfromFile() throws Exception {
		
	   try {
		   FileInputStream fi=new FileInputStream("LibraryBook.dat");
		   ObjectInputStream oi=new ObjectInputStream(fi);
		   Library l1=new Library();
		do {
		l1=(Library) oi.readObject();
		l1.displayMethod();
		}while(l1!=null);
		
	  }catch(Exception e) {
		  System.out.println();
	  }
	}
	
	void searchfromFile() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Book Name To Search : ");
		String b= s.next();
			
		try{
			ObjectInputStream oi= new ObjectInputStream(new FileInputStream("LibraryBook.dat"));
			Library r;
			do{
				r=(Library)oi.readObject();
				if(r.bname.equals(b)) 
					r.displayMethod();
				}while(r!=null);
			oi.close();
		}catch(Exception d){}	
	}
	

}



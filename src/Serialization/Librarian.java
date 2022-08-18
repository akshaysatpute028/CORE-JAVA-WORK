package Serialization;

import java.util.Scanner;

public class Librarian {	
	public static void main(String[] args) throws Exception {
		try {
			Library li=new Library();
			Scanner sc=new Scanner(System.in);
			int choice;
			char ask;
			do {
	
			System.out.println("\n1.Store Data To File \n2.Read Data From File \n3.Search Data From File ");
			System.out.println("Enter Choice : ");
			choice=sc.nextInt();
			
			if(choice==1) {
				li.getMethod();
				li.writeToFile(li);
			}
			else if(choice==2) {
				li.readfromFile();
			}
			else if(choice==3) {
				li.searchfromFile();
			}
			
			System.out.println("Do you want to continue ? y or n : ");
			ask=sc.next().charAt(0);
			
		}while(ask!='n');
	
	}catch(Exception e) {
		 System.out.println("Write Exception 1");
	}
	}
}


package LabTest_AkshaySatpute;

import java.util.Scanner;

public class HospitalManagementSystem {

	public static void main(String[] args) {
		try {
		Hospital h[]=new Hospital[100];        //Stores up to 100 records
		Scanner s=new Scanner(System.in);
		int choice1,choice2,count=0;
		String ask;
		do {
			System.out.println("\n1.Hospital Home Page \n2.Exit");
			System.out.print("\nEnter Choice : ");
			choice1=s.nextInt();
			if(choice1==1) {
				do {
					System.out.print("\nWelcome to ");
					Hospital.showHospital();
					System.out.println("\n1.Fetch Patient Record \n2.Display Patient Record");
					System.out.print("\nEnter Choice : ");
					choice2=s.nextInt();
					if(choice2==1) {
						System.out.print("\nEnter Number of records to fetch : ");
						count=s.nextInt();
						for(int i=0;i<count;i++) {
							h[i]=new Hospital();
							String pname,add;
							int age;
							long mobile;
							Scanner sc=new Scanner(System.in);
							System.out.print("Record "+(i+1));
							System.out.print("\nEnter Patient Name : ");
							pname=sc.nextLine();
							System.out.print("Enter Age : ");
							age=s.nextInt();
							System.out.print("Enter Address : ");
							add=sc.nextLine();
							System.out.print("Enter Mobile Number : ");
							mobile=s.nextLong();
							h[i].Patient(pname, age, add, mobile);
							System.out.println();
						}
					}
					else if(choice2==2) {
						for(int i=0;i<count;i++) {
							System.out.println("Record "+(i+1));
							h[i].diplayRecord();
							System.out.println();
						}
					}
					System.out.print("\nDo you want to continue? \nEnter Y or N : ");
					ask=s.next();
				}while(ask.equals("N")==false);
			}
			else if(choice1==2) break;
		}while(choice1!=2);
		}
		catch(NullPointerException e) {
		System.out.print("\nFirst Fetch Recods !!");
		System.out.println(e);
		}
	}

}

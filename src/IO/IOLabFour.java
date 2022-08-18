package IO;

import java.util.Scanner;

class Student extends Exception{
	Student(){
		System.out.println("WrongInputException");
	}
	Student(int a){
		System.out.println("RollNoOutOfRangeException");
	}
	Student(int a,int b){
		System.out.println("CreateObjectException");
	}
}

public class IOLabFour {

	public static void main(String[] args) throws Student {
		Scanner s=new Scanner(System.in);
		String name;
		int rollno;
		try {
			
			try {
				System.out.print("Enter Name : ");
				name=s.next();
				for(int i=0;i<name.length();i++)
					if(name.charAt(i)>='0' && name.charAt(i)<= '9' ) throw new Student();
				}catch(Student e) {
				//System.out.println(e);
				}
			
			try {
				System.out.print("Enter Roll no : ");
				rollno=s.nextInt();
				if(rollno>50) throw new Student(rollno);
				else throw new Student(1,1);
				}catch(Student f) {
				//System.out.println(f);
				}
		
		}catch(Exception f) {
			System.out.println(f);
		}
		System.out.println("Done");
	}
}



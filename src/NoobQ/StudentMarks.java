package NoobQ;

import java.util.Scanner;

public class StudentMarks {
	int bio,math,chem,eng,geo;
	int sum,avg;
	Scanner s=new Scanner(System.in);
	
	void result() {
		System.out.print("Enter marks in Bio = ");
		bio=s.nextInt();
		System.out.print("Enter marks in Math = ");
		math=s.nextInt();
		System.out.print("Enter marks in Chem = ");
		chem=s.nextInt();
		System.out.print("Enter marks in Eng = ");
		eng=s.nextInt();
		System.out.print("Enter marks in Geo = ");
		geo=s.nextInt();
	}
	void grade() {
		sum=bio+math+chem+eng+geo;
		avg=sum/5;
		
		System.out.print("\nAverage = "+avg);
		
		if(avg<40) System.out.print("\nFail");
		else if(avg>=40 && avg<=60) System.out.print("\nC Grade");
		else if(avg>=60 && avg<=80) System.out.print("\nB Grade");
		else System.out.print("\nA Grade");
	}

	public static void main(String[] args) {
		
		StudentMarks m=new StudentMarks();
		m.result();
		m.grade();
	}

}

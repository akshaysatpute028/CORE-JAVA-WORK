package Collection;

import java.util.LinkedList;
import java.util.*;

class Student
{
	String sname;
	int rollno;
	public Student(String sname, int rollno) {
		super();
		this.sname = sname;
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", rollno=" + rollno + "]";
	}
	
}
public class StudentListArray {

	public static void main(String[] args) {
		Student s[]=new Student[10];
		s[0]=new Student ("ashu",12);
		s[1]= new Student ("ashu",12);
		s[2]= new Student ("puja",13);
		
		LinkedList<Student> l= new LinkedList<Student>();
		l.add(s[0]);
		l.add(s[1]);
		l.add(s[2]);
		
		//display all data line by line using list iterator
		
		 //Iterator  i= l. descendingIterator();
		//ListIterator i= l.listIterator();  // cursor is at begining position of collection  
		
		ListIterator i= l.listIterator(3);// 3 is position number from where to start 
		
		//System.out.println("++++++++++ from begining record+++++++++++ ");
		//while(i.hasNext())	{			System.out.println(i.next());		}
		

		System.out.println("++++++++++++ previous record+++++++++++ ");
				
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
		 
	}

}

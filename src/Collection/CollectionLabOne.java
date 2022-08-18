package Collection;

import java.util.*;

class Student {
	String name;
	int rollno,marks;
	public Student(String name, int rollno, int marks) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", marks=" + marks + "]";
	}
	
}
public class CollectionLabOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Student> s=new LinkedList<Student>();
		Student st[]=new Student[5];
		for(int i=0;i<st.length;i++) {
			System.out.println("Enter Name ,Roll Number ,Marks of Student "+(i+1)+" : ");
			st[i]=new Student(sc.next(),sc.nextInt(),sc.nextInt());
			s.add(st[i]);
		}
		for(int i=0;i<s.size();i++) {
			System.out.println(s.get(i));
		}
	}
}

package Collection;

import java.util.*;

class Student implements Comparator<Student> {
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
	@Override
	public int compare(Student x,Student y) {
		if (x.rollno<y.rollno) return -1;
		else if (x.rollno>y.rollno) return 1;
		else return 0;
	}
	
}
public class PriorityQueueExample2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue<Student> s=new PriorityQueue<Student>();
		Student st[]=new Student[3];
		for(int i=0;i<st.length;i++) {
			System.out.println("Enter Name ,Roll Number ,Marks of Student "+(i+1)+" : ");
			st[i]=new Student(sc.next(),sc.nextInt(),sc.nextInt());
			s.add(st[i]);
		}
		for(int i=0;i<s.size();i++) {
			System.out.println(s.element());
		}
	}
}

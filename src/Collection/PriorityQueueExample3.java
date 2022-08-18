package Collection;

import java.util.*;

class BookData implements Comparable<BookData> {
	String name;
	int price;
	public BookData(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public int compareTo(BookData x) {
		if (price<x.price) return -1;
		else if (price>x.price) return 1;
		
		else return 0;
	
	}
	public String toString() {
		return " [Book Name = " + name + ", Price = " + price  + "]";
	}
}
public class PriorityQueueExample3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BookData st[]=new BookData[5];
		Queue<BookData> q1=new PriorityQueue<BookData>();
		
		for(int i=0;i<st.length;i++) {
			System.out.println("Enter Name , Price of Book "+(i+1)+" : ");
			st[i]=new BookData(sc.next(),sc.nextInt());
			q1.add(st[i]);
		}
		Iterator i=q1.iterator();
		Queue<BookData> q2=new PriorityQueue<BookData>();     
		while(i.hasNext())
			q2.add(q1.poll());                               //dequeue and store data in new priority queue
		System.out.println(q2);
	}
}

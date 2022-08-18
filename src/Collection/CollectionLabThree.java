package Collection;

import java.util.*;
class Book{
	String bname,aname;
	int price;
	public Book(String bname, String aname, int price) {
		super();
		this.bname = bname;
		this.aname = aname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "[Book name =" + bname + ", Author name =" + aname + ", Price =" + price + "]";
	}
	
}

public class CollectionLabThree {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<Book> l=new ArrayList<Book>();
		System.out.println("Enter number of book records to store : ");
		Book b[]=new Book[s.nextInt()];
		for(int i=0;i<b.length;i++) {
			System.out.println("Enter Book Name , Author , Price : ");
			b[i]=new Book(s.next(), s.next(), s.nextInt());
			l.add(b[i]);
		}
		ListIterator<Book> i=l.listIterator();
		while(i.hasNext()) {
			System.out.print(i.next());
		}
	}
}

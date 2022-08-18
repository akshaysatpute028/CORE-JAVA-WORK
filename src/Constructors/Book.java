package Constructors;

public class Book {
	String bookname,authorname;
	int isbn,price,pages;
	Book(){
		bookname="";
		authorname="";
		pages=0;
		isbn=0;
		price=0;	
	}
	
	Book(String n,String a,int p,int i,int pr){
		bookname=n;
		authorname=a;
		pages=p;
		isbn=i;
		price=pr;
	}
	
	Book(Book e){
		bookname=e.bookname;
		authorname=e.authorname;
		pages=e.pages;
		isbn=e.isbn;
		price=e.price;
	}

	public static void main(String[] args) {
		new Book();
		Book b1=new Book("Java","Proton",150,30,600);
		Book b2=new Book(b1);
		System.out.println(" "+b1.bookname+" "+b1.authorname+" "+b1.pages+" "+b1.isbn+" "+b1.price);
		System.out.println(" "+b2.bookname+" "+b2.authorname+" "+b2.pages+" "+b2.isbn+" "+b2.price);
	}

}

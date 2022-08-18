package Constructors;

public class Inventory {
	String pname;
	int qty,price;
	
	Inventory(){
		pname="";
		qty=0;
		price=0;
	}
	
	Inventory(String n,int q,int p) {
		pname=n;
		qty=q;
		price=p;
	}
	
	public static void main(String[] args) {
		
		Inventory i=new Inventory();
		Inventory i1=new Inventory("AC",1,4000);
		Inventory i2=new Inventory("Laptop",1,6000);
		Inventory i3=new Inventory("TV",1,8000);
		
		if((i1.price)>(i2.price) && (i2.price) >(i3.price)) {
			System.out.print("\nAC is expensive");
		}
		else if((i2.price)>(i1.price) && (i2.price) >(i3.price)) {
			System.out.print("\nLaptop is expensive");
		}
		else
			System.out.print("\nTV is expensive");

	}

}

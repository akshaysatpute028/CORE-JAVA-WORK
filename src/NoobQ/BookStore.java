package NoobQ;

import java.util.Scanner;

public class BookStore {
	static String b = "<....Visit Again....>";
	String name;
	int quantity;
	int price,bill,discount;
	Scanner s=new Scanner(System.in);
	
	void input() {
		System.out.print("Enter Book Name = ");
		name=s.next();
		System.out.print("Enter Price = ");
		price=s.nextInt();
		System.out.print("Enter Quantity= ");
		quantity=s.nextInt();
		
		bill=quantity*price;
		
		if(bill>5000) discount=bill-200;
		else discount=bill-100;
	}
	
	void display() {
		System.out.print("===================================");
		System.out.print("\nBook Name = "+name);
		System.out.print("\nPrice = "+price);
		System.out.print("\nQuantity= "+quantity);
		System.out.println("\nTotal Amount = "+bill);
		System.out.print("===================================");
		System.out.println("\nAmount to Pay = "+discount);
		System.out.print("===================================");
		System.out.println("\n"+b);
	}

	public static void main(String[] args) {
		BookStore b=new BookStore();
		b.input();
		b.display();

	}

}

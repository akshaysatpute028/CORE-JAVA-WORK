package Constructors;

public class Toy {
	String toyname;
	int price;
	static String madein="India";
	
	Toy(String toyname,int price){
		this.toyname=toyname;
		this.price=price;
	}

	public Toy() {
		// TODO Auto-generated constructor stub
	}

	static void staticdisplay() {
		System.out.print(" "+madein+" ");
	}
	
	void display() {
		System.out.print(toyname+" "+price+" ");
	}
}



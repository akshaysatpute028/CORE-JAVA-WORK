package Interface;

interface copmanyDetails {
	String companyname="TESLA";
	void enroll();
	default void message() {                                          //static or default
		System.out.println("Welcome To TESLA ");
	}
	abstract void vendors();
}

public class Product implements copmanyDetails  {
	@Override
	public void enroll() {
		System.out.println("New Model 123 ");
		
	}

	@Override
	public void vendors() {
		System.out.println("Vendor 1 launching Model 123 soon ");
		
	}

	public static void main(String[] args) {
		Product p=new Product();
		p.message();
		p.enroll();
		p.vendors();
		
	}

}

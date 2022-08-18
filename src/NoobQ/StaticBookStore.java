package NoobQ;

public class StaticBookStore {
	
	static int input(int p,int q) {
		return p*q;		
	}
	static int discount(int b) {
		if(b>5000) return b-200;
		else return b-100;
	}

	public static void main(String[] args) {
	int b,d;

	b =StaticBookStore.input(2000,2);                         //(book price,quantity)
	d=StaticBookStore.discount(b);
	System.out.print("\nTotal Amount = "+b);
	System.out.print("\nAmount To Pay = "+d);

	}

}

package NoobQ;

public class Patterns {
	
	void pattern1() {
		System.out.println("Patter 1 = ");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	void pattern2() {
		System.out.println("\nPatter 2 = ");
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	void pattern3() {
		int a=1;
		System.out.println("\nPatter 3 = ");
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}
	
	void pattern4() {
		char c='D';
		System.out.println("\nPatter 4 = ");
		for(int i=4;i>=1;i--) {
			c='D';
			for(int j=1;j<=i;j++) {
				System.out.print(c);
				c--;
			}
			System.out.println();
		}
	}
	
	

	public static void main(String[] args) {
		Patterns p=new Patterns();
		p.pattern1();
		p.pattern2();
		p.pattern3();
		p.pattern4();

	}

}

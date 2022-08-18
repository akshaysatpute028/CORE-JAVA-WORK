package LabTest_AkshaySatpute;

public class Patterns {
	
	void pattern1() {
		System.out.println("\nPatter 1 = ");
		for(int i=6;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	void pattern2() {
		char c='A';
		System.out.println("\nPatter 2 = ");
		for(int i=4;i>=1;i--) {
			c='A';
			for(int j=1;j<=i;j++) {
				System.out.print(c++);
				c++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Patterns p=new Patterns();
		p.pattern1();
		p.pattern2();

	}

}

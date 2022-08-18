package NoobQ;

import java.util.Scanner;

public class ReverseString {
    String name, rev="";
    char ch;
	Scanner s=new Scanner(System.in);
	
	void reverse() {
		System.out.print("Enter String : ");
		name=s.nextLine();
		
		for (int i=0; i<name.length(); i++) {
			ch= name.charAt(i);
			rev= ch+rev;
		}
		System.out.println("Reversed String : "+ rev);
	}

	public static void main(String[] args) {
		ReverseString r=new ReverseString();
		r.reverse();
	}
}

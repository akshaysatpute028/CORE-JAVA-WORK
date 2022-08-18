package NoobQ;

import java.util.Scanner;

public class UpperCaseString {
	String low;
	StringBuffer upper=new StringBuffer("");
	Scanner s=new Scanner(System.in);
	
	void convertUp() {
		System.out.print("Lower case string : ");
		low=s.nextLine();
		
		upper.append(low.toUpperCase());
		System.out.print("Upper case string : "+upper);
	}

	public static void main(String[] args) {
		UpperCaseString u=new UpperCaseString();
		u.convertUp();
	}
}

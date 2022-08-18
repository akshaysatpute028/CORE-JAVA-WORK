package NoobQ;

import java.util.Scanner;

public class CheckChar {
	String str;
	int count1,count2;
	Scanner s=new Scanner(System.in);
	
	void check() {
		
		System.out.print("Enter String : ");
		str=s.nextLine();
		char[] charSearch = {'a','v'};
		
		for(int i=0; i<str.length(); i++) {
			char chr = str.charAt(i);
			if(charSearch[0] == chr) {
				count1++;
				}
			if(charSearch[1] == chr) {
				count2++;
				}
			}
		System.out.println("a = "+count1+" v = "+count2);
		if (count1==2 && count2==4) System.out.println("True");                // True only when count of a & v is 2 & 4 respectively
		else System.out.println("False");	
	}

	public static void main(String[] args) {
		CheckChar c=new CheckChar();
		c.check();
	}
}

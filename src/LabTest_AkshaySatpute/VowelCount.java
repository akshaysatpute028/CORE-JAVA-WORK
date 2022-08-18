package LabTest_AkshaySatpute;

import java.util.Scanner;

public class VowelCount {
	static int checkCount(String checkme) {
	int count = 0;
	for(int i=0;i<checkme.length();i++) {
		if(checkme.charAt(i)== 'A' || checkme.charAt(i)== 'E' || checkme.charAt(i)== 'I' || checkme.charAt(i)== 'O' || checkme.charAt(i)== 'U' || 
				checkme.charAt(i)== 'a' || checkme.charAt(i)== 'e' || checkme.charAt(i)== 'i' || checkme.charAt(i)== 'o' || checkme.charAt(i)== 'u')
			count++;
	}
		return count;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String checkme=s.nextLine();
		System.out.println("Vowel count is equal to "+VowelCount.checkCount(checkme));
	}
}

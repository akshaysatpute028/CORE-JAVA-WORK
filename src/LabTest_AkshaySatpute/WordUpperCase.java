package LabTest_AkshaySatpute;

import java.util.Scanner;

public class WordUpperCase {
	String str;
	Scanner s=new Scanner(System.in);
	
	void convertUpperCase() {
		System.out.println("enter the String...");
		str=s.nextLine();
		
		char strletter []=str.toCharArray();   //characters of string stored in char array
		boolean foundspace=true;        //for space checking
		for(int i=0;i<strletter.length;i++) {
			if(Character.isLetter(strletter[i])) {   //character is letter checking
				if(foundspace) {   //for tracking the after space character
					strletter[i]=Character.toUpperCase(strletter[i]);
					foundspace=false;
					}
				}
			else
				foundspace=true;
		}
		str=String.valueOf(strletter);
		System.out.println("new String:"+str);
	}
	public static void main(String[] args) {
		WordUpperCase w=new WordUpperCase();
		w.convertUpperCase();
	}
}
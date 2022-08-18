package String;

import java.util.Scanner;

public class StringSumOfDigits {
	int i,sum=0;                                        //i for loop and sum
	String str="";                                      //initial string
	String digits="";                                   //string to store digits from initial string cuz thier type is string/char
	Scanner s= new Scanner(System.in);
	
	void check() {
		
		System.out.print("\nEnter String With Digits = ");
		str=s.nextLine();
		
		for(int i=0 ;i<str.length();i++) {
			
			if(str.charAt(i)>=48 && str.charAt(i)<=57 ) {      //ASCII Value 0=48 to ASCII Value 9=57            		
				
				digits = str.substring(i,i+1);                 //String digit to store only digits from the string using substring function 
				 
				sum = sum + Integer.parseInt(digits);          //As digit is a string of Numbers' ASCII values we need convert it to integers
				                                               //Using Integer.parseInt()      -----Wrapper class function
			}
		}
		System.out.print("\nSum = "+sum);                     //Sum of digits 
		
	}
		
	
	public static void main(String[] args) {
		StringSumOfDigits d=new StringSumOfDigits();
		d.check();
		
	}

}

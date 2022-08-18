package String;

import java.util.ArrayList;
import java.util.Scanner;

public class ParseIntMain {
	Scanner s=new Scanner(System.in);
	
	void Type1() {
		System.out.println("Type 1 : Enter Numbers Separated With Space On One Line = ");
	        
		String input = s.nextLine();
		String[] stringsArray = input.split(" "); // String.split(" ") this is a method of String class that separate words by a special character(s) like " " (space)
		
		int intArray [] = new int[stringsArray.length];
		for (int i = 0; i < stringsArray.length; i++) {
			intArray[i] = Integer.parseInt(stringsArray[i]);
			}
	}
	
	void Type2() {
		Scanner s=new Scanner(System.in);
		//STD INPUT
		int[] arr = new int[6]; 	//initialize array 
		for (int j = 0; j < arr.length; j++) {
			arr[j] = (s.hasNext() == true ? s.nextInt():null); // it will read the next input value
		  }
	}

	void Type3() {
		System.out.println("Type 3 : Enter Numbers Separated With Space On One Line = ");
		
		ArrayList<Integer> nums = new ArrayList<>();
		
	    String n = s.nextLine();  // User input
	    if (!n.isEmpty()) {
	       String[] str = n.split(" ");
	        for (String s : str) {
	            try {
	                nums.add(Integer.valueOf(s));
	            } catch (NumberFormatException e) {
	                System.out.println(s + " cannot be converted to Integer, skipping...");
	            }
	        }
	    }
	}

	public static void main(String[] args) {
		ParseIntMain p=new ParseIntMain();
		p.Type1();
		p.Type3();

	}

}

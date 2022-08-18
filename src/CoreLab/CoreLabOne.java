package CoreLab;

import java.util.Arrays;
import java.util.Scanner;

public class CoreLabOne {
	static boolean checkAnagram(String str1, String str2) {
		
		char arr1[]=str1.toLowerCase().toCharArray();
		char arr2[]=str2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2))
			return true;
		else
			return false;	
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter String 1 :");
		String str1=s.next();
		System.out.print("Enter String 2 :");
		String str2=s.next();
		
		boolean result=checkAnagram(str1,str2); 
		System.out.print(result);
	}

}

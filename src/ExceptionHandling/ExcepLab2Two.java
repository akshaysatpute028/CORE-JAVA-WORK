package ExceptionHandling;

import java.util.Scanner;

class WrongAlphabate extends Exception{
	WrongAlphabate(){
		System.out.println("Character is not an alphabet");
	}
	WrongAlphabate(char a){
		System.out.println("Color not found");
	}
}

public class ExcepLab2Two {
	
	static String displayColor(char c) {
		
		try {
			if(c=='v') return "Voilet";
			else if(c=='i') return "Indigo";
			else if(c=='b') return "Blue";
			else if(c=='g') return "Green";
			else if(c=='y') return "Yellow";
			else if(c=='o') return "Orange";
			else if(c=='r') return "Red";
			else throw new WrongAlphabate(c);
		}
		catch(WrongAlphabate b) {
			System.out.println(b);
		}
		return "Error!That's it..!";
	}
	
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	char c;
	try {
		System.out.println("Enter Single Character : ");
		c=s.next().charAt(0);
		if(c>='a' && c<='z') {
			System.out.println("Color : "+ExcepLab2Two.displayColor(c));
		}
		else throw new WrongAlphabate();
	}
	catch(WrongAlphabate a) {
		System.out.println(a);
		}
	}
}

package Array;

import java.util.Scanner;

public class ArrayCapitalWord {
	
	void checkWord() {
		 String str = "";
		 Scanner s=new Scanner(System.in);
		 
		 System.out.print("Enter String = ");
		 str=s.nextLine();
		 
		    String words[]=str.split("\\s");
		    String capitalizeStr="";
		 
        for(String word:words){

            String firstLetter=word.substring(0,1);

            String remainingLetters=word.substring(1);
            capitalizeStr+=firstLetter.toUpperCase()+remainingLetters+" ";
        }
        System.out.println(capitalizeStr);
	}
	
	public static void main(String[] args) {
		ArrayCapitalWord w=new ArrayCapitalWord();
		w.checkWord();
	}

}

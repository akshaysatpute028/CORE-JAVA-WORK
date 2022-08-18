package NoobQ;

public class WordUpperCase {
    String str = "welcome to java";
    String words[]=str.split("\\s");
    String capitalizeStr="";
	
	void checkWord() {
		
 
        for(String word:words){

            String firstLetter=word.substring(0,1);

            String remainingLetters=word.substring(1);
            capitalizeStr+=firstLetter.toUpperCase()+remainingLetters+" ";
        }
        System.out.println(capitalizeStr);
	}

	public static void main(String[] args) {
		WordUpperCase w=new WordUpperCase();
		w.checkWord();

	}

}

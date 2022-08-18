package ProblemSolving;

public class RomanToInt {
	
	public static int romanToInt(String s) {
	    int sum = 0;
	    int max = 0;
	    for (int i = s.length() - 1; i >= 0; i--) {
	        int current = getInt(s.charAt(i));
	        if (current >= max) {
	            sum += current;
	            max = current;
	        } else {
	            sum -= current;
	        }
	    }
	    return sum;
	}

	private static int getInt(char roman) {
	    switch (roman) {
	        case 'I':
	            return 1;
	        case 'V':
	            return 5;
	        case 'X':
	            return 10;
	        case 'L':
	            return 50;
	        case 'C':
	            return 100;
	        case 'D':
	            return 500;
	        case 'M':
	            return 1000;
	        default:
	            return 0;
	    }
	}
    
	public static void main(String[] args) {
    	int sum=RomanToInt.romanToInt("MCMXCIV");
    	System.out.println(sum);
    }
}

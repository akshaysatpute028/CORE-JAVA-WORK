package ProblemSolving;

public class Atoi {
	
	 public int myAtoi(String s) {
	        
	        s= s.trim();
	        int l = s.length();
	        if(l == 0)return 0;
	        int sign = 1;
	        int n = 0;
	        int d = 0;
	        int i = 0;
	        if(i < l && s.charAt(i) == '-'){sign = -1;++i;}
	        if(i < l && s.charAt(i) =='+' && sign == -1)return n;
	        if(i < l && s.charAt(i) =='+')++i;
	        
	        
	        while(i < l && Character.isDigit(s.charAt(i)))
	        {
	            d = s.charAt(i) - '0';
	            if(n > Integer.MAX_VALUE/10  || (n == Integer.MAX_VALUE/10 && d > Integer.MAX_VALUE%10))
	            {
	                return sign == 1? Integer.MAX_VALUE : Integer.MIN_VALUE;
	            }
	            
	            n = (n*10) + d;
	            ++i;
	        }
	        
	        return sign * n;
	    }

	public static void main(String[] args) {
		Atoi a=new Atoi();
		System.out.print(a.myAtoi("      -456 hgyfutf"));
	}
	
}

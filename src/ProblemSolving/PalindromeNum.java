package ProblemSolving;

public class PalindromeNum {
	int rem,rev;
	 public boolean isPalindrome(int x) {
		 int temp=x;
        if(temp<0)return false;
        else{
		 while(x!=0) {
	    	  rem=x%10;
	    	  rev=rev*10+rem;
	    	  x=x/10;
	      }
            if (rev==temp) return true;
            else return false;
        }   
	}
	 
	public static void main(String[] args) {
		PalindromeNum p=new PalindromeNum();
		boolean ans=p.isPalindrome(-121);
		System.out.print(ans);

	}
}

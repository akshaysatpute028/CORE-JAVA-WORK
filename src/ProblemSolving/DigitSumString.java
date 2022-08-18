package ProblemSolving;

public class DigitSumString {
	 
	public String digitSum(String s, int k){
	        if(s.length() <= k)
	            return s;
	        StringBuilder r = new StringBuilder();
	        for(int i = 1, sum = 0; i <= s.length(); i++){
	            sum += s.charAt(i - 1) - '0';
	            if(i % k == 0 || i == s.length()){
	                r.append(sum);
	                sum = 0;
	            }
	        }
	        return digitSum(r.toString(), k);
	    }
	
	public static void main(String[] args) {
		DigitSumString d=new DigitSumString();
		System.out.print(d.digitSum("11111222223",3));
	}
}
/*Q.
Input: s = "11111222223", k = 3
Output: "135"

Explanation: 
- For the first round, we divide s into groups of size 3: "111", "112", "222", and "23".
  ​​​​​Then we calculate the digit sum of each group: 1 + 1 + 1 = 3, 1 + 1 + 2 = 4, 2 + 2 + 2 = 6, and 2 + 3 = 5. 
  So, s becomes "3" + "4" + "6" + "5" = "3465" after the first round.
- For the second round, we divide s into "346" and "5".
  Then we calculate the digit sum of each group: 3 + 4 + 6 = 13, 5 = 5. 
  So, s becomes "13" + "5" = "135" after second round. 
Now, s.length <= k, so we return "135" as the answer.*/

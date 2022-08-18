package ProblemSolving;

public class GreaterRepeater {
	    static String largestGoodInteger(String num) {
	    	String a[]=new String[num.length()];
	    	int c=0;
	        for(int i=0;i<num.length()-1;i++){
	            if(num.charAt(i)==num.charAt(i+1)){
	                a[c]=String.valueOf(num.charAt(i));
	                a[c+1]=String.valueOf(num.charAt(i+1));
	                c++;
	            }
	        }
	        String greater="";
	        for(int i=0;i<a.length-1;i++) {
	        	
	        do {
	        	if(a[i].equals(a[i+1])) {
	        		greater+=a[i];
	        	}
	        }while(a[i]!=null);	
	        	}
	        System.out.println(greater);
	        return greater;
	    }

	public static void main(String[] args) {
		GreaterRepeater.largestGoodInteger("67777133339");
	}
}

package ProblemSolving;

class AtoiTwo {
	
	int atoi(String str) {
		// Your code here
		char ch='\0';
		if(str.charAt(0)=='-' )
		{
		    ch=str.charAt(0);
		    str=str.substring(1,str.length() );
		    
		}
		for(int i=0 ;i<str.length();i++ )
		{
		    if(!(str.charAt(i)>='0' && str.charAt(i)<='9') )
		    {
		        return -1;
		    }
		}

		return ch=='\0'? Integer.parseInt(str) : -Integer.parseInt(str) ;
		   }
	
	public static void main(String[] args) {
		AtoiTwo a=new AtoiTwo();
		System.out.println(a.atoi("-125"));

	}

}

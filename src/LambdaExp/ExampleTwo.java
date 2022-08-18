package LambdaExp;

//marker interface are empty interface 
//functional are interface with one abstract method
//define function without name 
//do implementation of interface method 
interface testing   {	  void testcase();  }
interface testing2  {    int  document();  }

interface sum      {  int add(int a,int b); }

public class ExampleTwo  {
	
	public static void main(String[] args) {
		
		 testing r= ()-> {
			 System.out.println("hello");
			 };
		 r.testcase();
	
		 //---------------------------------------
		 testing2 f= () -> 22;
		 int y=f.document();
		 System.out.println(y);
		 
		 //---------------------------------------	  
		  sum s= (a,b) -> a+b;                // overriding interface method and writing logic for tghe method
		  System.out.println(s.add(10, 20));
		  System.out.println(s.add(30, 30));
		  System.out.println(s.add(80, 20));  
		  
	}

}

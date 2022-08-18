package ExceptionHandling;

public class FinallyBlock {
	
	public static void main(String args[]){
		try{
			int data=25/0;    // throws exception
			System.out.println(data);    
		  }
		catch(ArithmeticException e){  // catch executes
			System.out.println(e);
		}
		finally {  //executes after catch else it will executes after try if try doesn't throw an exception
			System.out.println("finally block is always executed");
			}
		System.out.println("rest of phe code...");
		}
}    
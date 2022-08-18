package ExceptionHandling;

public class ThrowExceptionHandling {

		public static void main(String[] args) {
			
		 try
		 {
			int password=14;
			if( password==1234)
			{
				System.out.println("welcome user ");
			}
			else
				 throw  new ArithmeticException();
			
		 }
		 catch(ArithmeticException g)
		 {
			 System.out.println(" error occured");
		 }
		System.out.println("end of program ");
		}

	}
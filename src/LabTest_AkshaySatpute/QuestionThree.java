package LabTest_AkshaySatpute;

import java.util.Scanner;

class ExternalException extends Exception
{
	String msg;
	
	ExternalException()
	   {System.out.println(" External marks are incorrect");}
	ExternalException (String f)
	{
		msg=f;
	}
	public String getMessage()
	{
		return msg;
	}
}
class InternalException extends Exception
{String msg;
	InternalException()
	  {
		System.out.println("internal marks are incorrect");
		}
	InternalException(String h)
	{
		msg=h;
	}
	public String getMessage()
	{
		return msg;
	}
	
} 
public class QuestionThree {
 
	int imarks, emarks;
 
 public void getMarks() throws InternalException,ExternalException
 {
	 Scanner s= new Scanner(System.in);
	 imarks = s.nextInt();
	 emarks= s.nextInt();

		if(imarks>40)
			 throw new InternalException("Internal marks exceeds");
	
	 
	
	   if(emarks>60)
		   throw new ExternalException("external marks exceeds");
	 
	
	 System.out.println("total marks="+(imarks+ emarks));
 }
 
 public static void main(String[] args) {
		 try
		 {
			QuestionThree q= new QuestionThree();
		 	q.getMarks();
		 }
		 catch(InternalException t) {
			 System.out.println(t.getMessage());
		 }
		 catch(ExternalException t) {
			 System.out.println(t.getMessage());
		 }
		 	System.out.println("end of program ");
	}

}


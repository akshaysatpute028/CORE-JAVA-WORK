package ExceptionHandling;
//created user defined checked exception 

class Test3 extends Exception
{  String msg;

	Test3()
	{
		System.out.println("wrong value");
	}
	Test3(String m)
	{   
		msg=m;
		
	}
	@Override //annotation 
	public String getMessage()
	{
		return msg;
	}
	
}
public class UserDefinedThrows {

	public static void main(String[] args) throws Exception {
//try {
 int age=13;
 if(age<18)
	   throw  new Test3("not eleigble for voting");
//}catch(Test3 u){	System.out.println(u.getMessage());}
 
 System.out.println("end of program ");
	}

}
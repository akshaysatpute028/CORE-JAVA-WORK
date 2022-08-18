package ExceptionHandling;
//raise exception
public class ThrowException {   
    public static void validate(int password) {  
        if(password==1234) {  
        
        	System.out.println(" Welcome User !!");
        }  
        else {  
        	 throw new ArithmeticException("Incorrect Password");   
        }  
    }  

    public static void main(String args[]){  
        validate(123);  
        System.out.println("rest of the code...");    
  }    
} 
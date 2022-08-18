package NoobQ;

import java.util.*; 

class SwapNum {  
    
	public static void main(String[] args) {  
       
		int x, y, t; 
       
       Scanner s = new Scanner(System.in);  
       
       System.out.println("Enter the value of X and Y = ");  
       x = s.nextInt();  
       y = s.nextInt();  
       
       System.out.println("Before swapping numbers = "+x +"  "+ y); 
       t = x;  
       x = y;  
       y = t;  
       
       System.out.println("After swapping = "+x +"   " + y); 
    }    
} 
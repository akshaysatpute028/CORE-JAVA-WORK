package ProblemSolving;
import java.io.*;
import java.util.*;

public class ScanStringEOF {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	  Scanner scan = new Scanner(System.in);
    	   for(int i = 1; scan.hasNext()== true; i++){
    	       System.out.println(i + " " + scan.nextLine());
    	   }
    	   
    	   int i = 0;
    	   while(scan.hasNext()){
    	       i++;
    	       System.out.println(i + " " + scan.nextLine());
    	   }
    }
}
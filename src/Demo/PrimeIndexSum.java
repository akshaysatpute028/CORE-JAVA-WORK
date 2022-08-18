package Demo;

import java.util.*;

public class PrimeIndexSum {
    static void check(int n){
    	Scanner s=new Scanner(System.in);
        try {
            if(n<0)
                throw new Exception("Invalid Array size");
            int arr[]=new int [n];
            int sum=0;
            for(int i=1;i<n;++i) {
            	arr[i]=s.nextInt();
            	if(arr[i]<0) throw new Exception("Invalid Input");
            	else if(i%2==0)sum+=arr[i];
            }
            System.out.println(sum);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int n=s.nextInt();
        check(n+1);
    }
}
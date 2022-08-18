package Array;

import java.util.Scanner;

public class OddEvenArray {
	
	void check() {
		int i,j;
		int a []= new int[10];
		Scanner s=new Scanner(System.in);
		
		for ( i=0;i<10;i++) {
		System.out.println("Enter Number "+(i)+" = ");
			a[i]=s.nextInt();
		}
		for ( j=0;j<a.length;j++) {
			if(a[j]%2==0) {
				System.out.println(a[j]+" Even number ");
			}
			else System.out.println(a[j]+" Odd Number");
		}
	}

	public static void main(String[] args) {
		OddEvenArray a=new OddEvenArray();
		a.check();

	}

}

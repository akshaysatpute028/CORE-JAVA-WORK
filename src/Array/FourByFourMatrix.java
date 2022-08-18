package Array;

import java.util.Scanner;

public class FourByFourMatrix {
	
	int arr[][]=new int[4][4];
	int i,j,sumrow;
	Scanner s=new Scanner(System.in);
	void sumOfrows() {
		for (i = 0; i <4; i++) {	System.out.print("Enter No. = ");
			for (j = 0; j < 4; j++) {
				
				arr[j][i] = s.nextInt(); 
			}
		}
	}
	void display() {
		for (i = 0; i <4; i++) {
			System.out.println();
			for (j = 0; j < 4; j++) {	
				System.out.print("\t"+arr[j][i]); 
			}
		}
		System.out.println(); 
		for (i = 0; i <4; i++) {
			for (j = 0; j < 4; j++) {	
	              sumrow = sumrow + arr[j][i];  
			}
			System.out.println("Sum = "+sumrow);
		}
		
		
	}
	

	public static void main(String[] args) {
		FourByFourMatrix f=new FourByFourMatrix();
		f.sumOfrows();
        f.display();
	}

}

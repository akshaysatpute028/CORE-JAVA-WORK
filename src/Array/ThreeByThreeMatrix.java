package Array;

import java.util.Scanner;

public class ThreeByThreeMatrix {
	int arr[][]=new int[3][3];
	int copy[][]=new int[3][3];
	int i,j,sum,count;
	Scanner s=new Scanner(System.in);
	
	void input() {
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr.length;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr.length;j++) {
				System.out.print(" "+ arr[i][j]);
			}
			System.out.println();
		}
	}
	
	void rowSum() {
		for(i=0;i<arr.length;i++) {
			sum=0;
			for(j=0;j<arr.length;j++) {
				sum+=arr[i][j];
			}
			System.out.println("Sum of row = "+ sum);
		}	
	}
	
	void even() {
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr.length;j++) {
				if(arr[i][j]%2==0) {
					count++;
				}
			}
		}
		System.out.println("Count of even numbers = "+count);
	}
	
	void copy() {
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr.length;j++) {
				
				copy[i][j]=arr[i][j];
			
				}
			}
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr.length;j++) {
				System.out.print(" "+ copy[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		ThreeByThreeMatrix t=new ThreeByThreeMatrix();
		t.input();
		t.rowSum();
		t.even();
		t.copy();

	}

}

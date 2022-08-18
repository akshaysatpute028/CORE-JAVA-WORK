package Array;

import java.util.Scanner;

public class JaggedArray {
	int row,col;
	int arr [][]=new int[row][];
	Scanner s=new Scanner(System.in);
	
	void input() {
		System.out.print("Enter no. of rows = ");                                    
		row=s.nextInt();
		
		for(int i=0;i<row;i++) {                                                      //  arr[0]=new int[1];   arr[1]=new int[2];   arr[1]=new int[3];
			System.out.print("\nEnter no. of Coloumn for arr["+i+"] = ");
			col=s.nextInt();
			arr[i]=new int [col];
		}
		for(int i=0;i<row;i++) {
		for(int j=0;j<=arr[i].length;j++) {
			System.out.print("\nInsert  array element "+(j+1)+" :");
			arr[i][j]=s.nextInt();
			}
		}
	}
	
	void display() {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		JaggedArray j= new JaggedArray();
		j.input();
		j.display();
	}

}

package NoobQ;

import java.util.Scanner;

public class TableTwoAndEight {
	
	Scanner s=new Scanner(System.in);
	
	void TableOfTwo(int a){
		int t1=0,i;
		
		for(i=1;i<=10;i++) {
			t1=a*i;
			System.out.println(a+" x "+i+" = "+t1);
		}	
	}
	
	void TableOfEight(int b){
		int t2=0,j;
		
		for(j=1;j<=10;j++) {
			t2=b*j;
			System.out.println(b+" x "+j+" = "+t2);
		}	
	}
	
	public static void main(String[] args) {
		TableTwoAndEight t=new TableTwoAndEight();
		Scanner s=new Scanner(System.in);
		int choice;
		System.out.print("1.Table of 2 \n2.Table of 8 ");
		do {
			System.out.print("\nEnter Choice = ");
			choice=s.nextInt();
			
			if(choice==1) t.TableOfTwo(2);
			else if(choice==2) t.TableOfEight(8);
			
			else System.out.print("\nIncorrect Choice");
			
		}while(choice!=2);
	}
}

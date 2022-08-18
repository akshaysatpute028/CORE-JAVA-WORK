package Array;

import java.util.Scanner;

public class StringArray {
	
	void check() {
		String find="akshay";
		int i,j;
		String name []= new String[2];
		Scanner s=new Scanner(System.in);
		
		for ( i=0;i<name.length;i++) {
		System.out.print("Enter Name "+(i+1)+" = ");
			name[i]=s.next();
		}
		for ( j=0;j<name.length;j++) {
			if(name[j].equals(find)) {
				System.out.println(" Found at "+j);
				break;
			}
		}
		if(j==name.length) System.out.println("Not Found");
	}
	
	public static void main(String[] args) {
		StringArray a=new StringArray();
		a.check();

	}

}

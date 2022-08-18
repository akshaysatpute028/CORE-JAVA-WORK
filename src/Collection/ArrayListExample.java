package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<Integer>a=new ArrayList<Integer>();
		for(int i=0;i<5;i++) {
		a.add(s.nextInt());
		}
		for(int i=0;i<5;i++) {
			System.out.print(" "+a.get(i));
		}
		
		System.out.println(a.size());
		System.out.println(a.get(0));
		a.remove(0);
		System.out.println(a.size());
		System.out.println(a.get(0));
	}

}

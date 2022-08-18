package LabTest_AkshaySatpute;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuestionOne {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
		int a=s.nextInt(),b=s.nextInt(),c;
		c=a/b;
		}
		catch (ArithmeticException e){
			System.out.print(e);
		}
		catch (InputMismatchException i){
			System.out.print(i);
		}
	}

}

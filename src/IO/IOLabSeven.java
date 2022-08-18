package IO;
import java.util.Scanner;
//Write a program to ask two password  from user (in string ) and compare them.
//If both are equal print "access allowed" otherwise ask string maximum of three times

public class IOLabSeven {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String setpass,pass,username;
		int count=0,chance=3;
		
		System.out.print("Enter User Name : ");
		username=s.next();
		System.out.print("Set Password : ");
		setpass=s.next();
		System.out.print("Enter Password : ");
		pass=s.next();

		if(setpass.equals(pass)) System.out.println("\nAccess Allowed");
		else do {
			System.out.println(chance+" Chance Remaining");
			System.out.print("Enter Password : ");
			pass=s.next();
			if(setpass.equals(pass)) {System.out.println("\nAccess Allowed");break;}
			count++;chance--;
		}while(count!=3);
		if(count==3) System.out.println("\nAccount Blocked");
	}
}

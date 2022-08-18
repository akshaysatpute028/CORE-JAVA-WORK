package LabTest_AkshaySatpute;

import java.util.Scanner;

public class Abbrevation {
  
 static void printInitials(String name)
 {
     if (name.length() == 0)
         return;
     System.out.print(Character.toUpperCase(
         name.charAt(0)));
     for (int i = 1; i < name.length() - 1; i++)
         if (name.charAt(i) == ' ')
             System.out.print(" " + Character.toUpperCase(name.charAt(i + 1)));
 }

 public static void main(String args[]) {
	 Scanner s=new Scanner(System.in);
	 System.out.print("Enter full name : ");
	 String name=s.nextLine();
     printInitials(name);
     }
 }
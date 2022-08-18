package InnerClasses;

import java.util.Scanner;

public class School {
	Scanner s=new Scanner(System.in);
	
	class info{
		String name;
		int age;
		int contact;
		void getInfo() {
			System.out.print("Name : ");
			name=s.nextLine();
			System.out.print("Age : ");
			age=s.nextInt();
			System.out.print("\nContact No. :");
			contact=s.nextInt();
		}
	}
	
	void getData(String role) {
		
		interface check{
			default void checkme() {
				System.out.println("Implemented");
			}
		}
		if(role.equals("teacher")) {
			class Teacher extends info implements check {
				void subjects() {
					System.out.println("Java , C , C++");
				}
				void show() {
					System.out.println(name);System.out.println(age);System.out.println(contact);
				}
			}
			Teacher t=new Teacher();t.getInfo();t.show(); t.subjects();t.checkme();
		}
		else if(role.equals("student")) {
			class Student extends info implements check{
				void course() {
					System.out.println("PG-DAC");
				}
				void show() {
					System.out.println(name);System.out.println(age);System.out.println(contact);
				}
			}
			Student s=new Student();
			s.getInfo();s.show();s.course();s.checkme();
		}
		else System.out.println("\nIncorrect role");
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		School c=new School();
		String role;
		System.out.println("Enter Role : ");
		role=s.next();
		c.getData(role);
	}

}

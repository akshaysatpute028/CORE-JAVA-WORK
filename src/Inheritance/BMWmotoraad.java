package Inheritance;

import java.util.Scanner;

class SportsS1000RR extends BMWmotoraad {
	static String name="S 1000RR";
	static void vehicleName() {
		System.out.print("\nVehicle name : "+name);
	}
	static void color() {
		System.out.print("\nColors : \n1.Racing red \n2.Black Storm Metallic \n3.Style Passion");
	}
	static void vehiclePrice() {
		System.out.print("\nPrice = 20 Lacs Only");
	}
}
class SportsM1000RR extends BMWmotoraad {
	static String name="M 1000RR";
	
	static void vehicleName() {
		System.out.print("\nVehicle name : "+name);
	}
	static void color() {
		System.out.print("\nColors : \n1.M RR in Light white \n2.M RR with M Competition Package ");
	}
	static void vehiclePrice() {
		System.out.print("\nPrice = 40 Lacs Only");
	}
}

public class BMWmotoraad {
	static String type="Two Wheeler";
	static String modeltype="Sport";
	static String enginetype="Four Cylinder";
	
	static void vehicleType() {
		System.out.print("\nVehicle Type = "+type);
	}
	static void modelType() {
		System.out.print("\nModel Type = "+modeltype);
	}
	static void engineType() {
		System.out.print("\nEngine Type = "+enginetype);
	}

	public static void main(String[] args) {
		int choice=0;
		Scanner s=new Scanner(System.in);
		
		System.out.println("\nWelcome to BMW Motoraad Sports \n1.S1000RR \n2.M1000RR");
		
		do {
			System.out.print("\nEnter choice = ");
			choice=s.nextInt();
			if(choice==1){
				SportsS1000RR.vehicleType();
				SportsS1000RR.modelType();
				SportsS1000RR.engineType();
				SportsS1000RR.vehicleName();
				SportsS1000RR.color();
				SportsS1000RR.vehiclePrice();
				System.out.println();
			}
			else if(choice==2){
				SportsM1000RR.vehicleType();
				SportsM1000RR.modelType();
				SportsM1000RR.engineType();
				SportsM1000RR.vehicleName();
				SportsM1000RR.color();
				SportsM1000RR.vehiclePrice();
				System.out.println();
			}
			else System.out.println("\nEnter correct choice !!");
		}while(choice!=2);	
	}
}

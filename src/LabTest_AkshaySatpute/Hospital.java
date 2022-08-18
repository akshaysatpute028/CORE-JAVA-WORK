package LabTest_AkshaySatpute;

class Patient {
	String pname,add;
	int age;
	long mobile;
	
	void Patient() {
		pname="";
		age=0;
		add="";
		mobile=0;
	}
	void Patient(String pname,int age,String add,long mobile) {
		this.pname=pname;
		this.age=age;
		this.add=add;
		this.mobile=mobile;
	}
	void diplayRecord() {
		System.out.println("Patient Name : "+pname);
		System.out.println("Age : "+age);
		System.out.println("Address : "+add);
		System.out.println("Mobile Number : "+mobile);
	}
}
public class Hospital extends Patient {
	static final String hname = "Lifepoint Multispecialty Hospital";
	static final String add = "Pune,Maharashtra";
	
	static void showHospital() {
		System.out.println(hname);
		System.out.println(add);
	}
}

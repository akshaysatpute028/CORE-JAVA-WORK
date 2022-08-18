package Constructors;
// Q6. Java program to demonstrate Constructor Chaining to other class using super() keyword
class Base {
	String name;
	Base() {  // constructor 1
		this("");
		System.out.println("No-argument constructor of base class");
	}
	
	Base(String name) {  // constructor 2
		this.name = name;
		System.out.println("Calling parameterized constructor of base");
	}
}

public class ConstructorChaining extends Base {
	ConstructorChaining() {  // constructor 3
		System.out.println("No-argument constructor of derived");
	}
	ConstructorChaining(String name) { // parameterized constructor 4
		super(name);   // invokes base class constructor 2
		System.out.println("Calling parameterized constructor of derived");
	}
	
	public static void main(String args[]) {
		ConstructorChaining obj = new ConstructorChaining("test");  // Calls parameterized constructor 4
		//ConstructorChaining obj1 = new ConstructorChaining();    // Calls No-argument constructor
	}
}

package Abstract;
abstract class car {
	String type="four wheeler";
	abstract void company();
	}

class one extends car {
		void company() {
			System.out.println("TATA");		
		}	
	}
	
class two extends car {
		void company() {
			System.out.println("Suzuki");		
		}	
	}

public class Store {

	public static void main(String[] args) {
		car o=new one();                            //Parent class reference is used to allocate all child classes to the same obj/ref 
		o.company();
		o=new two();
		o.company();
	}
}

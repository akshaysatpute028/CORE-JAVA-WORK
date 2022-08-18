package Constructors;

public class ElectronicToy extends Toy {
	Toy t;
	String modelno;
	
	ElectronicToy (	String modelno,Toy r){
		super();
		this.modelno=modelno;
		t=r;	
	}
	
	void printAll() {
		System.out.print(" "+modelno+" ");
		t.display();
		Toy.staticdisplay();
	}
	
	public static void main(String[] args) {
		Toy t =new Toy("CAR",600);
		ElectronicToy r=new ElectronicToy("176v4",t);
		r.printAll();
	}

}

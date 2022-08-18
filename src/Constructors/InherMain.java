package Constructors;
class GrandParent {
	GrandParent(){System.out.println("GrandParent");}
	GrandParent(int a){System.out.println("G");}
}

class parent extends GrandParent {
	parent(){System.out.println("Parent");}
	parent(int a){super(a);System.out.println("P");}
}

class child extends parent {
	child(){System.out.println("Child");}
	child(int a){super(a);System.out.println("C");}
}

public class InherMain extends child {

	InherMain(){System.out.println("Main");}
	InherMain(int a){super(a);
		System.out.println("M");}
	
	public static void main(String[] args) {
		InherMain i=new InherMain(6);
		System.out.println();
		child c=new child(6);
		System.out.println();
		parent p=new parent(6);
		System.out.println();
		GrandParent g=new GrandParent(6);
	}

}

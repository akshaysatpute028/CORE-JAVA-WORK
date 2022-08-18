package Constructors;


public class Parameterise {

	Parameterise(int id,String name){
		System.out.println(" "+id+" "+name);
	}

	public static void main(String[] args) {
		Parameterise obj1=new Parameterise(1234,"XYZ");
		Parameterise obj2=new Parameterise(123,"ABC");
		
	}

}

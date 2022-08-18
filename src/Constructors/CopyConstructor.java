package Constructors;

class employee {
int empid;
String  name;
employee(){
	empid=0;
	 name="";
}

employee(int x,String y) {
	empid=x;
    name=y;
}
employee(employee e) {
	empid=e.empid;
	name=e.name;
}
}
public class CopyConstructor{
	public static void main(String[] args) {
		new employee(); 
		employee e1=new employee (20,"Akshay");
		employee e2=new employee (e1);
		System.out.println(e1.empid+" "+e1.name);
		System.out.println(e2.empid+" "+e2.name);
	}

}
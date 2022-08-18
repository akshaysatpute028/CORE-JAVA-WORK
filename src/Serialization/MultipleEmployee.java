package Serialization;

import java.io.*;

public class MultipleEmployee {

	

	public static void main(String[] args) throws Exception {
		try {
			Employee e =new Employee();
			e.getDetails();
			File i=new File("AllEmployee.dat");
			FileOutputStream fo=new FileOutputStream("AllEmployee.dat",true);
			int len=(int) i.length();
			
			if(len>0) {
				StoreData s=new StoreData(fo);
				s.writeObject(e);
				s.close();
			}
			else {
				ObjectOutputStream o=new ObjectOutputStream(fo);
				o.writeObject(e);
				o.close();
			}
			
			FileInputStream fi=new FileInputStream("AllEmployee.dat");
			ObjectInputStream oi=new ObjectInputStream(fi);
			Employee n;
			do {
				n= (Employee) oi.readObject();
				n.displayDetails();
			}while(n!=null);
			
			
		}catch(Exception e) {}

	}

}

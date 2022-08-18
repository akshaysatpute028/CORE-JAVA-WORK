package Collection;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		
		Map <Integer,String> m=new TreeMap();
		m.put(1, "Akshay");
		m.put(2, "Nikhil");
		m.put(3, "Vinod");
		m.put(4, "Binod");
		System.out.println(m.get(1));
		System.out.println(m);
		m.replace(2,"Binod");
		System.out.println(m);
		m.remove(1);
		System.out.println(m);
	}

}

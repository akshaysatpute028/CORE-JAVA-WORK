package Collection;

import java.util.*;

public class CollectionLabTwo {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("Akshay");
		v.add("Harshal");
		v.add("Rushabh");
		v.add("Prabhakar");
		Enumeration<String> e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println(e.hashCode());
		System.out.println(v.get(0));
		System.out.println(v.size()+" "+v.capacity());
		v.add(0,null);
		System.out.println(v.indexOf(null));
		v.insertElementAt("Mayur",5);
		System.out.println(v);
		v.remove(0);
		System.out.println(v);
	}
}

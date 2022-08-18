package Collection;

import java.util.*;

public class ArrayListAndVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> al = new ArrayList<String>();

        al.add("Hello");
        al.add("World");
        al.add("!");
        al.add("!");

        System.out.println("ArrayList elements are:"); 
        Iterator<String> it = al.iterator();            // traversing
        while (it.hasNext())
            System.out.println(it.next());

        Vector<String> v = new Vector<String>();
        v.addElement("Akshay");
        v.addElement("Sam");
        v.addElement("Neel");

        System.out.println("\nVector elements are:");
        Enumeration<String> e = v.elements();       //// traversing
 
        while (e.hasMoreElements())
            System.out.println(e.nextElement());
	}

}

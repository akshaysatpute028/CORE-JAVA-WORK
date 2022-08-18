package Collection;

import java.util.*;

public class CollectionLabFive {

	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>();
		LinkedList<String> l2=new LinkedList<String>();
		
		l1.add("Hello");
		l1.add("World");
		l2.add("Hello");
		l2.add("Students");
		
		System.out.println(l1.getFirst().contains(l2.peek()));
		System.out.println(l1.getFirst().contains(l2.getLast()));
		System.out.println(l1.getFirst().contains(l2.getFirst()));
		System.out.print(l1.containsAll(l2));
	}

}

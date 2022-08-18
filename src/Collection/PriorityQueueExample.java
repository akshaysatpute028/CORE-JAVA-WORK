package Collection;

import java.util.*;

class MyComparator implements Comparator<String>{
	@Override
	public int compare(String x,String y) {
		return x.length()-y.length();
	}	
}

public class PriorityQueueExample {

	public static void main(String[] args) {
		Queue <String>p=new PriorityQueue<String>(15,new MyComparator());
		p.add("India");
		p.add("USA");
		p.add("China");
		p.add("England");
		p.add("Brazil");
		
		Iterator i=p.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(p);
		System.out.println();
		while(p.size()!=0) {
			System.out.println(p.poll());
		}
		System.out.println(p);
	}
}

package Collection;

import java.util.*;

public class CollectionLabSix {

	public static void main(String[] args) {
		HashSet<String> h1=new HashSet<String>();
		h1.add("Red");
		h1.add("Green");
		h1.add("Black");
		h1.add("White");
		h1.add("Green");
		HashSet<String> h2=new HashSet<String>();
		h2.add("Red");
		h2.add("Pink");
		h2.add("Black");
		h2.add("Orange");
		h2.add("Red");
		for(String color : h2) {
			System.out.println(h1.contains(color)?"True":"False");
		}
		System.out.println(h1);
		System.out.println(h2);
		Queue<String> q=new PriorityQueue<String>();
	}
}

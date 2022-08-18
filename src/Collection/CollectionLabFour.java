package Collection;

import java.util.*;

public class CollectionLabFour {

	public static void main(String[] args) {
		Set<String> t=new TreeSet<String>();
		t.add("Black");
		t.add("Yellow");
		t.add("Blue");
		t.add("Red");
		t.add("Green");
		Iterator<String> i=t.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}

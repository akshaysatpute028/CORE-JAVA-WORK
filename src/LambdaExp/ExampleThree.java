package LambdaExp;

import java.util.ArrayList;
import java.util.List;

interface product
{
	int cal(int a);
}

public class ExampleThree {

	public static void main(String[] args) { //2 annonymouis class

	 product p=	new product() {
			public int cal(int y)
			{
				return 100*y;
			}
		};
		System.out.println(p.cal(10));
		
		//==========================================
		product r= (int y) ->y*100; //replaced line 12 to 18 by this command 
		System.out.println(r.cal(10));
		
		//==========================================
		List <String>l=new ArrayList<String>();
		l.add("neha");
		l.add("gagan");
		l.add("ritu");
		l.forEach((x)->System.out.println(x));
	}
}

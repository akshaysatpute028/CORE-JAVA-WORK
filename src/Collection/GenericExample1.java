package Collection;
//this is an example for generic classes

class Test<T>
{
	T a;
	void setA(T x)	{		a=x;	}
	T getA()  	    {		return a;	}
}
public class GenericExample1 {

	public static void main(String[] args) {
      Test <Integer> r= new Test<Integer>();
      r.setA(12344);
      System.out.println(r.getA());

      Test <Float> g= new Test<Float>();
      g.setA(23.45f);
      System.out.println(g.getA());

	}
}
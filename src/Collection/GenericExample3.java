package Collection;
class Addition<T>{
	
	@SuppressWarnings("unchecked")
	T Add(T a,T b) {
		if(a instanceof Integer && b instanceof Integer) {
			Integer result=(Integer)a + (Integer)b;
			return (T) result;
		}
		else if(a instanceof Float && b instanceof Float) {
			Float result=(Float)a + (Float)b;
			return (T) result;
		}
		else if(a instanceof String && b instanceof String) {
			String result=(String)a + (String )b;
			return (T) result;
		}
		return null;
		
	}
}
public class GenericExample3 {

	public static void main(String[] args) {
		Addition<Integer> i=new Addition<Integer>();
		i.Add(20, 30);
		System.out.println(i.Add(20, 30));
		
		Addition<Float> f=new Addition<Float>();
		f.Add(15.5f, 21.5f);
		System.out.println(f.Add(15.5f, 21.5f));
		
		Addition<String> s=new Addition<String>();
		s.Add("Hello ", "World !");
		System.out.println(s.Add("Hello ", "World !"));
	
	}

}

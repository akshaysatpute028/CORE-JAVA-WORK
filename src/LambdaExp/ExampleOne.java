package LambdaExp;
interface One{
	String greater(int a);
}
public class ExampleOne {
	public static void main(String[] args) {
		One o = (a) ->
		{
			if(a>10) return "Yes";
			else return "No";
		};
		System.out.println(o.greater(5));
		System.out.println(o.greater(8));
		System.out.println(o.greater(15));
		System.out.println(o.greater(1));
	}
}

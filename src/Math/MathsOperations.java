package Math;

public class MathsOperations {
	public static int maxNumber(int a ,int b ,int c){
		if(a>b && b>c) return a;
		else if(b>a && b>c) return b;
		else return c;
	}
	public static int minNumber(int a ,int b ,int c){
		if(a<b && a<c) return a;
		else if(b<c) return b;
		else return c;
	}
}

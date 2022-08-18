package ExceptionHandling;

public class ExcepLab2One {

	public static void main(String[] args) {	//Command Line Inputs [ 10 5 6 15 a ]
		int num=0;
		for(int i=0;i<args.length;i++) {
			try {
				num=Integer.valueOf(args[i]);
				if(num<10) throw new ArithmeticException();
			}
			catch(NumberFormatException e){
				System.out.println(e);
			}
			catch(ArithmeticException a){
				System.out.println(a);
			}
		}
	}
}

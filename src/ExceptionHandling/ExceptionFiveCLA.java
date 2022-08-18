package ExceptionHandling;
//Q.5
class MyException extends Exception{
	MyException(){}
}

public class ExceptionFiveCLA {

	public static void main(String[] args) {   //Command Line Inputs { 5 A 20 }
		int sum=0;
		int num[]=new int[args.length];
		
		for(int i=0;i<args.length;i++) {
			try {
			num[i]=Integer.valueOf(args[i]);
			}
			catch (NumberFormatException e) {
                System.out.println(e);
            }
		}
		
		for(int j=0;j<args.length;j++) {
			try {
			if(num[j]<10) throw new MyException();
			}
			catch(MyException m) {
				System.out.println("Number is lesser than 10");
			}
			sum+=num[j];
		}
		System.out.println(sum);
	}
}

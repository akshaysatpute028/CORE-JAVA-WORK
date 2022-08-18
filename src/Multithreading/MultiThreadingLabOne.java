package Multithreading;
class CalEvenOdd {
void display(int num)
	{
		try
		{
			if(num%2==0) System.out.println("Even "+num);
			else System.out.println("Odd "+num);
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
	}
}
class Even extends Thread{
	int num;
	CalEvenOdd r;
	public Even(CalEvenOdd r,int num) {
		this.r=r;
		this.num = num;
	}
	public void run() {
		synchronized (r) {
		 r.display(num);
		}	
	}
	
}

class Odd extends Thread{
	int num;
	CalEvenOdd r;
	public Odd(CalEvenOdd r,int num) {
		this.r=r;
		this.num = num;
	}
	public void run() {
		synchronized (r) {
		 r.display(num);
		}	
	}
	
}
public class MultiThreadingLabOne {

	public static void main(String[] args) {
		CalEvenOdd r=new CalEvenOdd();
		Even e1 =new Even(r,2);
		e1.start();
		Even e2 =new Even(r,4);
		e2.start();
		Odd e3 =new Odd(r,5);
		e3.start();
		Odd e4 =new Odd(r,9);
		e4.start();

	}
}

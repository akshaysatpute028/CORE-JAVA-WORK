package Multithreading;

public class MultiThreading implements Runnable {
String play;
Thread t;
	
MultiThreading(String s) {
		play=s;
		t=new Thread(this);
		t.start();
	}
	public void run()  {
	try {
		for(int i=1;i<=3;i++) {
			System.out.print(" "+i+" "+play);
				Thread.sleep(1000);
				System.out.println();
				System.out.println(" "+i);
		}
	}catch(InterruptedException e) {}
	}
	public static void main(String[] args) throws InterruptedException {
		MultiThreading e=new MultiThreading("One");
		
		MultiThreading e1=new MultiThreading("Two");

		MultiThreading e2=new MultiThreading("Three");
	}
}

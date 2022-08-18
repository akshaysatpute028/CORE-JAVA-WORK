package Multithreading;

public class ThreadExample3  extends Thread {
//public class ThreadExample3  implements Runnable 	
	
	public void run(){
		try {
		for( int i=0;i<10;i++){
			System.out.println(" in run"+ i);
			 Thread.sleep(1000);// throws InterruptedException
		}
		}catch(Exception c){}
	}

	public static void main(String[] args) throws Exception{
		
		ThreadExample3 r= new ThreadExample3();
		r.start(); // start is a lifecycle method of thread class 
		           // start method will call run method
		for( int i=0;i<10;i++) {
			System.out.println("in main"+ i);
			Thread.sleep(1000);
		}
	}
}

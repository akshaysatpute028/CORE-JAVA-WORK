package Multithreading;

class ThreadB extends Thread{
    int total;
    public void run() {
        synchronized(this) {
        	for(int i=0; i<100 ; i++) {
        		total += i;
            }
        	notify();
        }
    }
}
public class WaitAndNotify {
	
    public static void main(String[] args){
        ThreadB b = new ThreadB();
        b.start();
        
        synchronized(b){
            try{
            	System.out.println("Waiting for b to complete...");
            }catch(Exception e){}
            System.out.println("Total is: " + b.total);
        }
    }
}

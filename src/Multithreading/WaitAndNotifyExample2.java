package Multithreading;

class Calculation extends Thread
{
	int sum=0;
	public void run()
	{try {
		synchronized(this)
		{
		for(int i=0;i<100;i++)
		{
			sum =sum+ i;
		}
		notify();
		}
	}
	catch(Exception e) {} }	}
public class WaitAndNotifyExample2 {

	public static void main(String[] args) {
			Calculation c= new Calculation();
            c.start();
            synchronized(c) {
            	try {
            		System.out.println(" waiting for total !!!!!!");
            		c.wait();
            	}catch(Exception e) {}
            }
            System.out.println(c.sum);
    }
}

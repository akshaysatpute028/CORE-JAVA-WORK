package Multithreading;
class Calculator1
{
//synchronized void display(String msg)
void display(String msg)
	{
		try
		{
			for(int i=0;i<msg.length();i++)
			{
				System.out.println(msg.charAt(i));
				Thread.sleep(1000);
			}
		}catch(InterruptedException f) {}
	}
}

class SyncThread1 extends Thread
{  
   Calculator1 r;
   String m;
   SyncThread1(Calculator1 r,String m)
   {
	   this.r=r;
	   this.m=m;
	
   }
	public void run()
	{ 
		//synchronized block 
		synchronized (r)
		{
		 r.display(m);
		}
		
	}
}
public class SyncThreadExample {

	public static void main(String[] args) {
		Calculator1 x= new Calculator1();
		SyncThread1 k= new SyncThread1 (x,"welcome");
		SyncThread1 k1= new SyncThread1(x,"javaworlds");
		k.start();
		k1.start();
	}

}

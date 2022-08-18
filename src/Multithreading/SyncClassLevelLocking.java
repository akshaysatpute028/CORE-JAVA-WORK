package Multithreading;
//demonstrate class level locking by implementing 
//synchronization on static components
class Calculator2
{
//	synchronized static void display(String msg)
static void display(String msg)
	{
		try
		{
			for(int i=0;i<msg.length();i++)
			{
				System.out.print (msg.charAt(i));
				Thread.sleep(100);
			}
		}catch(InterruptedException f) {}
	}
static void show(String msg)
	{
		try
		{
			for(int i=0;i<msg.length();i++)
			{
				System.out.print ( msg.charAt(i));
				Thread.sleep(100);
			}
		}catch(InterruptedException f) {}
	}
}
class SyncThread2 extends Thread
{  
  
 String m;
 SyncThread2(Calculator2 r,String m)
 {
	   this.m=m;
	
 }
	public void run()
	{ 
		//static synchronized block 
		synchronized (Calculator2.class)
		{
		 Calculator2.display(m);
		 Calculator2.show("India");
		}	
	}
}
public class SyncClassLevelLocking {

	public static void main(String[] args) {
		Calculator2 x= new Calculator2();
		SyncThread2 k= new SyncThread2 (x,"welcome");
		SyncThread2 k1= new SyncThread2(x,"javaworlds");
		k.start();
		k1.start();
	}
}



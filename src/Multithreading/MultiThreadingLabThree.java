package Multithreading;
import java.io.*;

class syncthread {
	//synchronized
	public void readFile(String msg) {
		try {
			FileReader f= new FileReader(msg);
			int e;
			do {
				e= f.read();
				System.out.print((char)e);
				Thread.sleep(500);
			}while(e!=-1);
		}catch(Exception d){}
	}
}

class ShowFileThread extends Thread{
	syncthread i;
	String msg;
	ShowFileThread(syncthread i,String msg) {
		this.i=i;
		this.msg=msg;
	}
	public void run() {
		//synchronized block
		synchronized(i){
			i.readFile(msg);
		}
	}
}

public class MultiThreadingLabThree {
	
	public static void main(String[] args) {
		syncthread i = new syncthread();
		ShowFileThread y= new ShowFileThread(i,args[0]);
		ShowFileThread z= new ShowFileThread(i, args[1]);
		y.start();
		z.start();
	}
}


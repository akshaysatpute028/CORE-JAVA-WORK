package NoobQ;

public class TotalEvenNum {
	int count;	
	
	void check() {
		
		for(int i=1301;i<2300;i++) {
			if(i%2==0) count++;
		}
		System.out.print("Total even numbers between 1300 & 2300 = "+count);
	}

	public static void main(String[] args) {
		TotalEvenNum  t=new TotalEvenNum ();
		t.check();
	}
}

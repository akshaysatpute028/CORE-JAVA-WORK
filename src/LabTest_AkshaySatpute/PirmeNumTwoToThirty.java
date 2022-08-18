package LabTest_AkshaySatpute;

public class PirmeNumTwoToThirty {
	int num1=2,num2=30,i,j;
	
	void primeNumber() {
		
		for(i=num1 ;i<=num2 ;i++) {
			for(j=2 ;j<=i ;j++) {
			 if(i%j== 0)
				 break;
			}
			if(i==j)
				System.out.print ("  "+ j); 
		}
		
	}

	public static void main(String[] args) {
		
		PirmeNumTwoToThirty  p = new PirmeNumTwoToThirty ();
		p.primeNumber();
	}

}

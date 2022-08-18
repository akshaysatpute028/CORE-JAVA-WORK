package Array;

public class MatrixAddition{
	int a[][]={{11,12,13,14,15},{12,13,16,14,15},{16,17,18,19,20}};    
	
	int b[][]={{16,17,18,19,20},{14,15,12,13,16},{11,12,13,14,15}};    
	    
	int c[][]=new int[3][5];
	
	void add() {
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
				}
			System.out.println();
		}
	}

	public static void main(String args[]){ 
		MatrixAddition a=new MatrixAddition();
		a.add();
	} 
}
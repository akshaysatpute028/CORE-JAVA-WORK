package IO;

public class CharacterByteArray {

	public static void main(String[] args) {


		char a[]=new char[5];
		a[0]='a';
		a[1]='b';
		a[2]='c';
		a[3]='d';
		a[4]='a';
		System.out.println(a);
		//for(int i=0;i<a.length;i++) System.out.println(a[i]);
		
		int b[]={122,3,44,5,6,7,8};
		System.out.println(b);//print address
		
		String p[]= {"neha","gagan","ashu"};
		System.out.println(p[1]);
		

	}

}

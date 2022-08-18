package String;

public class AddString {
	
	String s1="Try";
	String s2="Best";
	String result="";
	
	void check() {
		for(int i=0;i<3;i++) {
			result+=s1+s2;		
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		AddString a=new AddString();
		a.check();

	}

}

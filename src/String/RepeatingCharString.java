package String;

public class RepeatingCharString {
	
	String s ="proton";
	String a="";
	
	void check() {
		
		for(int i=0;i<s.length();i++) {
			
				a+=s.substring(i, i+1)+s.substring(i, i+1);
		}
		
		System.out.print(a);
	}

	public static void main(String[] args) {
		
		RepeatingCharString r=new RepeatingCharString();
		r.check();

	}

}

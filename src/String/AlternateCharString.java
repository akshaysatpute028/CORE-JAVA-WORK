package String;

public class AlternateCharString {

	public static void main(String[] args) {
		String a="abcd";
		String b="stuv";
		String r="";
		
		for(int i=0;i<a.length()||i<b.length();i++) {
			if(i<a.length()) {
			r+=a.substring(i,i+1)+b.substring(i,i+1);
			}
		}
		System.out.print(r);

	}

}

package NoobQ;

import java.util.Scanner;

public class SecurityPassword {
	int i;
	String password;
	String code="COOLCOOL";
	Scanner s=new Scanner(System.in);
	
	void check() {
	
		for(i=1;i<=3;i++) {
		System.out.print("Enter Password = ");
		password=s.next();
		if(password.equals(code)) System.out.println("==========WELCOME USER=========");
		else System.out.println("Re-enter Password");
		}
	}

	public static void main(String[] args) {
		
		SecurityPassword p=new SecurityPassword();
		p.check();

	}

}

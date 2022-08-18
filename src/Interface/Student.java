package Interface;
//Q.7
public class Student {
	
	void Addstudent () {
		
		class MtechStudent implements Admission{
			
			public void registration() {
				System.out.println("Student 1");
				Admission a=new Admission() {
					@Override
					public void registration() {
						System.out.println("Student 2");
					}
				};
				a.registration();
			}
		
		}
		MtechStudent m=new MtechStudent();
		m.registration();
	}

}

package NoobQ;

public class Rectangle {
	
	float width=5.5f,height=8.5f;
	float area,parameter;
	
	void area() {
		area=width*height;
		System.out.print("Area of Rectangle = "+area);	
	}
	void parameter() {
		parameter=2*(width+height);
		System.out.println("Parameter of Rectangle = "+parameter);
	}

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.area();
		r.parameter();

	}

}

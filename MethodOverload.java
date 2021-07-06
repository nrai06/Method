
public class MethodOverload {

	public void area(int b,int h) {
		System.out.println("Area of traingle  " +(0.5*b*h));
	}
	public void area(int r) {
		System.out.println("Area of circle  " +(3.14*r*r));
	}
	
	
	public static void main(String[] args) {
		
		MethodOverload a=new MethodOverload();
	    a.area(10,5);
	    a.area(5);
}
}

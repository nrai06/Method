
public class MethodCall {

	int val=200;
	int operation(int val) {
		val=val*10/100;
		return val;
		

	}
	
	public static void main(String[] args) {
		MethodCall d=new MethodCall();
		System.out.println("Before operation value of data is"+d.val);
		d.operation(100);
		System.out.println("After operation value of data is"+d.val);
		
	}
}

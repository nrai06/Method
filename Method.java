
public class Method {
	
	public int multiplynumbers(int a ,int b){
		
	int z=a*b;
	return z;
	
	}
	public static void main(String[] args) {
		
		Method mul=new Method();
		int result=mul.multiplynumbers(10, 3);
		System.out.println("Multiplication is:" +result);
		
		
	}

}
